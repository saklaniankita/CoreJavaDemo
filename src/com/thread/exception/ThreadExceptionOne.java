package com.thread.exception;

/**
 * 
 * IllegalMonitorStateException is thrown in this case because wait method is
 * called without locking the current object using synchronised block. OR the
 * current thread is not the owner of the object's monitor.
 * 
 * This exception is thrown by notify, notifyAll methods also for the same
 * reason
 * 
 * why?
 * 
 * @author Ankita
 * 
 */
public class ThreadExceptionOne extends Thread {
	public void run() {
		try {
			 synchronized (this) {
				System.out.println(this.getClass());
			 	this.wait(5000);
			 }
			//this.wait(5000);

			System.out.println("TASK");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThreadExceptionOne t1 = new ThreadExceptionOne();
		t1.start();
	}
}