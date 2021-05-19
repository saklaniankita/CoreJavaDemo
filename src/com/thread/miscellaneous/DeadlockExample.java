 package com.thread.miscellaneous;

/**
 * Deadlock can be avoided if two methods acquire locks in the same order unlike
 * the case below. If thread1 acquires lock on nameOne then thread2 will not be
 * able to acquire lock on nameOne unless first thread is done with its task.
 * 
 * @author Ankita
 * 
 */
public class DeadlockExample {
	public static void main(String[] args) {
		final String nameOne = "hey";
		final String nameTwo = "there";

		Thread thread1 = new Thread() {
			public void run() {
				synchronized (nameOne) {
					System.out.println("Thread1 : Lock acquired on nameOne");
					System.out.println(Thread.currentThread().getState());Thread.currentThread().interrupt();
					synchronized (nameTwo) {
						System.out.println("Thread1 : Lock acquired on nameTwo");
					}
				}
			}
		};

		Thread thread2 = new Thread() {
			/*
			 * This method also requests same two lock but in exactly Opposite order i.e.
			 * first nameTwo and then nameOne. This creates potential deadlock, if one
			 * thread holds nameOne lock and other holds nameTwo lock and they wait for each
			 * other, forever.
			 */

			public void run() {
				synchronized (nameTwo) {
					System.out.println("Thread2 : Lock acquired on nameTwo");
					synchronized (nameOne) {
						System.out.println("Thread2 : Lock acquired on nameOne");
					}
				}
			}
		};

		// thread1.run();
		// thread2.run();

		thread1.start();
		thread2.start();

	}
}
