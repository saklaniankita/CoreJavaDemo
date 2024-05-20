package com.thread.states;

public class ThreadStatesExample implements Runnable {

	Thread t;

	ThreadStatesExample(String name) {
		t = new Thread(this, name);
		System.out.println("Child Thread : " + t);
		System.out.println("State : " + t.getState());
		t.start();
	}

	@Override
	public void run() {
		System.out.println("State inside run : " + t.getState());
		try {
			for (int i = 1; i <= 3; i++) {
				System.out.println(t.getName() + " : " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println(t.getName() + "is interrupted");
		}
		System.out.println("State leaving run : " + t.getState());
	}
}
