package com.practice;

public class DeadlockExample {
	public static void main(String[] args) {
		final String nameOne = "hey";
		final String nameTwo = "there";

		Thread thread1 = new Thread() {
			public void run() {
				synchronized (nameOne) {
					System.out.println("Thread1 : Lock acquired on nameOne");
					synchronized (nameTwo) {
						System.out.println("Thread1 : Lock acquired on nameTwo");
					}
				}
			}
		};

		Thread thread2 = new Thread() {
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
