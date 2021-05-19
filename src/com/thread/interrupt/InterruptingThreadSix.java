package com.thread.interrupt;

/**
 * 
 * t1.interrupt does not interrupt the main thread as shown in previous programs
 * and thus Thread.interrupted() returns false inside main method. But if we
 * want to interrupt the main thread we can use
 * Thread.currentThread().interrupt()
 * 
 * 
 * Thread.interrupted() and Thread.currentThread().isInterrupted() will return
 * false after first call to Thread.interrupted() has returned true.
 * 
 * @author Ankita
 * 
 */
public class InterruptingThreadSix extends Thread {
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("InterrupedException Occurred");
		}
	}

	public static void main(String[] args) {
		InterruptingThreadSix t1 = new InterruptingThreadSix();
		t1.setName("ChildThreadOfMain");
		t1.start();
		t1.interrupt();
		System.out.println("t1.isInterrupted() : " + t1.isInterrupted());

		// Two threads are different
		System.out.println(Thread.currentThread().getName() + "____" + t1.getName());

		// interrupting the current/main thread
		Thread.currentThread().interrupt();

		// Thread.interrupted will return true only once and will set the
		// interrupted flag to false
		System.out.println("Thread.currentThread().isInterrupted() before Thread.interrupted() : "
				+ Thread.currentThread().isInterrupted());
		System.out.println("Interrupted Flag for the first time: " + Thread.interrupted());

		// interrupted flag has been set to false as we have already called
		// Thread.interrupted
		System.out.println("Thread.currentThread().isInterrupted() after Thread.interrupted() : "
				+ Thread.currentThread().isInterrupted());
		System.out.println("Interrupted Flag for the second time: " + Thread.interrupted());

		// Interrupting thread for the SECOND time
		System.out.println("*********************************************************");
		System.out.println();
		Thread.currentThread().interrupt();
		System.out.println("Interrupted Flag for the first time: " + Thread.interrupted());
		System.out.println("Interrupted Flag for the second time: " + Thread.interrupted());

	}
}
