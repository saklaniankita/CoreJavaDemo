package com.thread.interrupt;

/**
 * 
 * Thread interruption in the catch block is ignored and returned false because
 * the thread was not alive at the time of Thread.interrupted()
 * 
 * Thread.interrupted() returns true only if current thread has been interrupted
 * 
 * See all cases 1) when Thread.interrupted() is called before Thread.sleep()
 * (InterruptingThreadSeven.java) 2) when Thread.interrupted() is called in
 * catch block (InterruptingThreadEight.java) 3) when Thread.interrupted() is
 * called outside the try-catch block (InterruptingThreadEight.java)
 * 
 * @author Ankita
 * 
 */
public class InterruptingThreadEight extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("TASK");
		} catch (InterruptedException e) {
			System.out.println("Is the thread interrupted : " + Thread.interrupted());
		}
		System.out.println("Is the thread interrupted now : " + Thread.interrupted());
	}

	public static void main(String[] args) {
		InterruptingThreadEight t1 = new InterruptingThreadEight();
		t1.start();
		t1.interrupt();
		System.out.println("t1.isInterrupted() : " + t1.isInterrupted());
	}
}
