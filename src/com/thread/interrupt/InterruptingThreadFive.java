package com.thread.interrupt;

/**
 * Thread.interrupted() inside main method will return false because it is NOT
 * the main/current thread which is interrupted. It is the other thread which is
 * created when we call t1.start() and run() method of this separate thread is
 * run. That is why first call to Thread.interrupted() inside run method returns
 * true(first call returns true and subsequent calls sets flag to false if it is
 * true). Rest of the calls return false.
 * 
 * Since the interrupted flag has set to FALSE,the thread is no more interrupted
 * and Thread.sleep() does not throw InterruptedException and finishes normally
 * 
 * @author Ankita
 * 
 */
public class InterruptingThreadFive extends Thread {
	public void run() {
		System.out.println("Current Thread : " + Thread.currentThread().getName());
		try {
			System.out.println("Thread.interrupted()inside run 1: " + Thread.interrupted());
			System.out.println("Thread.interrupted()inside run 2: " + Thread.interrupted());
			System.out.println("Thread.interrupted()inside run 3: " + Thread.interrupted());

			// Current thread is not interrupted anymore because interrupted
			// flag has been set to false
			System.out.println("Is the thread still interrupted : " + Thread.currentThread().isInterrupted());

			// Since the thread is not interrupted any more, sleep will execute
			// completely without any exception
			Thread.sleep(3000);

			System.out.println("Sleep Ended....");
			System.out.println("Current state; " + Thread.currentThread().getState());
		} catch (InterruptedException e) {
			System.out.println("InterruptedException Occurred");
		}
	}

	public static void main(String[] args) {
		InterruptingThreadFive t1 = new InterruptingThreadFive();
		System.out.println("Current Thread : " + Thread.currentThread().getName());
		System.out.println("Current State: " + Thread.currentThread().getState());
		t1.start();
		t1.interrupt();

		System.out.println("t1.isInterrupted() : " + t1.isInterrupted());

		// Current thread has not been interrupted
		System.out.println("Thread interrupted in main thread: " + Thread.interrupted());

	}
}
