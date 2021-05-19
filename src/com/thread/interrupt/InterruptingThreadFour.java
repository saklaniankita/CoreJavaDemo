package com.thread.interrupt;

/**
 * 
 * The static Thread.interrupted() method returns the interrupted flag and after
 * that, it sets the flag to false if it is true. Thus every first call to
 * Thread.interrupted inside run method returns true and every subsequent calls
 * to Thread.interrupted return false.
 * 
 * @author Ankita
 * 
 */
public class InterruptingThreadFour {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					if (Thread.interrupted()) {
						System.out.println("Code for interrupted thread");
					} else {
						System.out.println("Code for normal thread");
					}
				}
				try {
					System.out.println("Sleeping......");
					Thread.sleep(5000);
					System.out.println("sleep end...");
				} catch (InterruptedException e) {
					System.out.println("Current State: " + Thread.currentThread().getState());
					System.out.println("Interrupted Exception has occurred");
				}

			}
		}, "t1");
		t1.start();
		t1.interrupt();
		System.out.println("t1 thread interrupted: " + t1.isInterrupted());
		System.out.println("   ");
	}
}
