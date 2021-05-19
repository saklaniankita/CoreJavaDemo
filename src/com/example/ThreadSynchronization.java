package com.example;

public class ThreadSynchronization implements Runnable {

	public synchronized void run() {
		System.out.println("Starting Implementation of Thread " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread " + Thread.currentThread().getName() + " value : " + i);
		}
		System.out.println("Ending Implementation of Thread " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("Program starts...");
		ThreadSynchronization th1 = new ThreadSynchronization();
		Thread t1 = new Thread(th1);
		t1.setName("ABC");
		t1.setPriority(Thread.MAX_PRIORITY);
		synchronized (t1) {
			t1.start();
		}

		ThreadSynchronization th2 = new ThreadSynchronization();
		Thread t2 = new Thread(th2);
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.setName("DEF");
		synchronized (t2) {
			t2.start();
		}
		System.out.println("Program ends...");
	}
}
