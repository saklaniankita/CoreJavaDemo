 package com.thread.interrupt;

/**
 * here we are handling the interrupt ,but not to any more exceptions because we
 * are trying to show that even after interrupt occurs, the thread does NOT stop
 * working i.e. it is still holding the lock. Thus thread is holding the lock on
 * the object before,during and after the sleep. Interruption has got nothing to
 * do with the lock
 * 
 * 
 * NOTE 2: When the thread is interrupted it goes from sleep/wait state to Runnable state
 * 
 * @author Ankita
 * 
 */
public class InterruptingThreadTwo extends Thread {
	public void run() {
		try {
			System.out.println("Not interrupted");
			System.out.println("Still Not interrupted");
			Thread.sleep(1000);
			System.out.println("TASK");
		} catch (InterruptedException e) {
			System.out.println("Exception Handled in run method !!!!!!");
			System.out.println("Current State: " + Thread.currentThread().getState()); //NOTE 2
		}
		System.out.println("THREAD IS STILL RUNNING "+Thread.currentThread().getState());
	}

	public static void main(String[] args) {
		InterruptingThreadTwo t1 = new InterruptingThreadTwo();
		t1.start();
		t1.interrupt();
		System.out.println("t1.isInterrupted() : " + t1.isInterrupted());
		// System.out.println("Thread.interrupted() : " + Thread.interrupted());
	}
}
