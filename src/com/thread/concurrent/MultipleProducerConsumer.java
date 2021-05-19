package com.thread.concurrent;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Multiple Producer - Multiple Consumer
 * 
 * 
 * 
 * @author Ankita
 *
 */
public class MultipleProducerConsumer {

	static Semaphore sem1 = new Semaphore(0);
	static Semaphore sem2 = new Semaphore(100);
	static Queue<Item> items = new ArrayDeque<Item>();
	Lock lock = new ReentrantLock();
	private static int COUNT = 1000;
	

	public static void main(String[] args){
		MultipleProducerConsumer obj = new MultipleProducerConsumer();
		
		Thread penProducer = new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						sem2.acquire();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					obj.addPen();
					sem1.release();
				}
			}
		});
		
		Thread notePadProducer = new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						sem2.acquire();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					obj.addNotepad();
					sem1.release();
				}
			}
		});
		
		Thread stationaryProducer = new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						sem2.acquire();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					obj.addOtherStationary();
					sem1.release();
				}
			}
		});

		Thread ConsumerOne = new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						sem1.acquire();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					obj.consumeItem();
					sem2.release();
				}
			}
		});
		
		Thread ConsumerTwo = new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						sem1.acquire();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					obj.consumeItem();
					sem2.release();
				}
			}
		});
		
		Thread ConsumerThree = new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						sem1.acquire();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					obj.consumeItem();
					sem2.release();
				}
			}
		});

		penProducer.start();
		notePadProducer.start();
		stationaryProducer.start();
		ConsumerOne.start();
		ConsumerTwo.start();
		ConsumerThree.start();
	}
	
	public void addPen() {
		Item item = new Item(COUNT++,"Pen");
		lock.lock();
		items.offer(item);
		System.out.println("Item Added=> "+item+"  "+Thread.currentThread().getName());
		//56789= +System.out.println(items);
		lock.unlock();
	}
	
	public void addNotepad() {
		Item item = new Item(COUNT++,"NotePad");
		lock.lock();
		items.offer(item);
		System.out.println("Item Added=> "+item+"  "+Thread.currentThread().getName());
		//System.out.println(items);
		lock.unlock();
	}
	
	public void addOtherStationary() {
		Item item = new Item(COUNT++,"Stationary");
		lock.lock();
		items.offer(item);
		System.out.println("Item Added=> "+item+"  "+Thread.currentThread().getName());
		//System.out.println(items);
		lock.unlock();
	}
	
	public void consumeItem() {
		lock.lock();
		Item item = items.poll();
		System.out.println("Item removed: "+item+"  "+Thread.currentThread().getName());
		//System.out.println(items);
		lock.unlock();

	}
}
