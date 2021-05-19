package com.thread.exception;

/**
 * why wait throws interrupted exception
 * 
 * @author Ankita
 *
 */
public class ThreadExceptionTwo extends Thread {
	public void run() {
		try {
			System.out.println("1");
			synchronized (this) {
				System.out.println("2");
				this.wait();
				System.out.println("3");
			}
			System.out.println("TASK");
		} catch (InterruptedException e) {
			System.out.println("4 ");
			System.out.println("Current state of thread inside Exception block : " + Thread.currentThread().getState());
			e.printStackTrace();
		}
		System.out.println("Current state of thread : " + Thread.currentThread().getState());
	}

	public static void main(String[] args) {
		ThreadExceptionTwo t1 = new ThreadExceptionTwo();
		t1.start();
		t1.interrupt();
	}
}