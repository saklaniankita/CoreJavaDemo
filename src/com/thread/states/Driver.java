package com.thread.states;

public class Driver {
	public static void main(String[] args) {
		ThreadStatesExample thread1 = new ThreadStatesExample("MyThread");
		try {
			System.out.println("Main Thread is waiting...");
			Thread.sleep(5000);
			System.out.println("Thread State after sleep : " + thread1.t.getState());
			thread1.t.join();
			System.out.println("Thread State after join : " + thread1.t.getState());

		} catch (InterruptedException e) {
			System.out.println("Main thread is interrupted");
		}
		System.out.println("Main thread terminated : " + thread1.t.getState());
	}
}
