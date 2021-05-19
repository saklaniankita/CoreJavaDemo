package com.thread.states;

/**
 * 
 * A thread will be in WAITING state when wait() or join() method is called.
 * Below example shows the thread state when join() method is called.
 * 
 * @author Ankita
 * 
 */
public class ThreadStatesFour {
	public static void main(String[] args) {
		final Thread t1 = new Thread() {
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				try {
					t1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		t2.start();
		t1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Checking the state of t2 after it calls join() on t1

		System.out.println(t2.getState()); // Output : WAITING
	}

}
