package com.thread.states;

public class ThreadStatesTwo {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();

		// Checking the state before starting the thread

		System.out.println(t.getState()); // Output : NEW

		t.start();

		// Checking the state after starting the thread

		System.out.println(t.getState()); // Output : RUNNABLE
		
		t.join();
		
		System.out.println(t.getState()+"____"+Thread.currentThread().getState());
		

	}

}
