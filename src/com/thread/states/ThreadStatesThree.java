package com.thread.states;

/**
 * 
 * A thread will be in this state when a thread is waiting for object lock to
 * enter into synchronized method/block or a thread will be in this state if
 * deadlock occurs. Below example shows the states of two threads when deadlock
 * occurs.
 * 
 * @author Ankita
 * 
 */
public class ThreadStatesThree {
	public static void main(String[] args) {
		final Shared s1 = new Shared();
		final Shared s2 = new Shared();

		Thread t1 = new Thread() {
			public void run() {
				System.out.println("I am in run of t1");
				s1.methodOne(s2);
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("I am in run of t2");
				s2.methodTwo(s1);
			}
		};

		t1.start();
		t2.start();

		try {
			// Thread.sleep(1000);
			// Thread.sleep(2000);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Checking states of both the threads

		System.out.println("t1 state :" + t1.getState()); // Output : BLOCKED
		System.out.println("t2 state : " + t2.getState()); // Output : BLOCKED
	}

}

class Shared {
	synchronized void methodOne(Shared s) {
		System.out.println("I am in methodOne");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		s.methodTwo(this);
		System.out.println("METHODONE"); // This won't print
	}

	synchronized void methodTwo(Shared s) {
		System.out.println("I am in methodTwo");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		s.methodOne(this);
		System.out.println("METHODTWO"); // This won't print
	}
}
