package com.thread.interrupt;

/**
 * If thread is not in either sleeping or waiting mode, it will behave normally
 * even after interrupt is called. Though calling interrupt method will set the
 * interrupted flag to true
 * 
 * @author Ankita
 * 
 */
public class InterruptingThreadThree extends Thread {
	public void run() {
		System.out.println("No INTERRUPTION BECAUSE THREAD IS NOT IN SLEEP MODE");
		System.out.println("Current State: " + Thread.currentThread().getState());
	}

	public static void main(String[] args) {
		InterruptingThreadThree t1 = new InterruptingThreadThree();
		t1.start();
		t1.interrupt(); // interrupt flag is set to true
		System.out.println("Has the thread been interrupted: " + t1.isInterrupted()); // interrupt flag is returned
	}
}
