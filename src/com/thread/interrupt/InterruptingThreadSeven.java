package com.thread.interrupt;

/**
 * If we call Thread.interrupted before Thread.sleep(), it returns true and at
 * the same time it sets the interrupted flag to false. Thus it won't cause any
 * interruptedException during sleep and will execute normally.
 * 
 * @author Ankita
 * 
 */
public class InterruptingThreadSeven extends Thread {
	public void run() {
		try {
			System.out.println("One :" + Thread.interrupted());
			Thread.sleep(1000); // Thread is no more interrupted
			System.out.println("TASK");
		} catch (InterruptedException e) {
			throw new RuntimeException("Thread Interrupted.........");
		}
	}

	public static void main(String[] args) {
		InterruptingThreadSeven t1 = new InterruptingThreadSeven();
		t1.start();
		t1.interrupt();
		System.out.println("t1.isInterrupted() : " + t1.isInterrupted());
	}
}
