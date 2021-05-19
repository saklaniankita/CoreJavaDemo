package com.thread.concurrent;

import java.util.Stack;
import java.util.concurrent.Semaphore;

/**
 * Single Producer - Single Consumer
 * 
 * 
 * Semaphore can be released by any thread, even by the one which has never
 * acquired it That is why it is used to form producerConsumer Design Pattern
 * 
 * @author Ankita
 *
 */
public class ProducerConsumer {

	static Semaphore sem1 = new Semaphore(0);
	static Semaphore sem2 = new Semaphore(1);
	static Item item = null;
	private static int COUNT = 1000;
	// private static Stack<Item> stack = new Stack<Item>();

	public static void main(String[] args) {
		ProducerConsumer obj = new ProducerConsumer();
		Thread producer = new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						sem2.acquire();
						obj.produceItem("Pen");
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						sem1.release();
					}
				}
			}
		});

		Thread Consumer = new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						sem1.acquire();
						obj.consumeItem();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						sem2.release();
					}
				}
			}
		});

		producer.start();
		Consumer.start();
	}

	public void produceItem(String item) {
		// Item addedItem = stack.push(new Item(COUNT++, item));
		Item addedItem = new Item(COUNT++, item);
		this.item = addedItem;
		System.out.println("Item Added=> " + addedItem);
	}

	public void consumeItem() {
		// Item deletedItem = stack.pop();
		System.out.println("Item being Removed=> " + this.item);
		this.item = null;

	}
}
