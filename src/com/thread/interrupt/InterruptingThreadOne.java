package com.thread.interrupt;

/**
 * Here just as the thread starts , interrupt occurs which breaks the sleeping/waiting
 * thread and throws interrupted exception. Here we are propagating the
 * exception to a RuntimeException
 * 
 * To interrupt a thread, that thread must throw an InterruptedException via Thread.sleep() or wait() method
 * 
 * If thread is not in sleep or wait mode, nothing happens, just the interrupt
 * flag is set true
 * 
 * 
 * @author Ankita
 * 
 */
public class InterruptingThreadOne extends Thread {
	public void run() {
		try {
			System.out.println("isInterrupted() ?: " + Thread.currentThread().isInterrupted());
			Thread.sleep(100000);
			System.out.println("TASK");
		} catch (InterruptedException e) {
			System.out.println("Thread state after interruption : " + Thread.currentThread().getState());
			throw new RuntimeException("Thread Interrupted.........");
		}
	}

	public static void main(String[] args) {
		InterruptingThreadOne t1 = new InterruptingThreadOne();
		t1.start();
		t1.interrupt(); //We are interrupting a thread that throws an interrupting Exception via Thread.sleep()
		System.out.println("t1.isInterrupted() : " + t1.isInterrupted());
	}
}
