package com.thread.states;

/**
 * TERMINATED A thread will be in this state once it finishes it’s execution.
 * 
 * @author Ankita
 *
 */
public class ThreadStatesSix {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i <= 25; i++) {
					System.out.println(i);
				}
			}
		};

		t.start();

		try {
			Thread.sleep(2000); // Main thread is sleeping for 2 sec
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Checking the state when thread t is finished it's execution

		System.out.println(t.getState()); // Output : TERMINATED
	}

}
