package com.thread.yield;

/**
 * 
 * public static native void yield(); Currently running thread goes from running
 * to runnable state and is halted to give other higher(or equal) priority
 * thread, in the thread pool, a chance to run.
 * 
 * All threads have normal priority by default.
 * 
 * If no threads are waiting or other threads have lower priority than the
 * yielding thread, then same thread continues.
 * 
 * It is advisable to use sleep instead of yield method because halt time is in
 * the hands of programmer while using sleep method
 * 
 * Yield is the only method that takes a thread from Running to Runnable state.
 * Rest other methods like seep, wait, join takes the thread from running to
 * waiting state
 * 
 * @author Ankita
 * 
 */
public class YieldDemo {
	public static void main(String[] args) {
		YieldRunnable yr = new YieldRunnable();
		ThreadGroup allThreads = new ThreadGroup("All Threads");
		Thread t1 = new Thread(allThreads, yr, "t1");
		Thread t2 = new Thread(allThreads, yr, "t2");
		Thread t3 = new Thread(allThreads, yr, "t3");
		Thread t4 = new Thread(allThreads, yr, "t4");
		Thread t5 = new Thread(allThreads, yr, "t5");
		Thread t6 = new Thread(allThreads, yr, "t6");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(Thread.NORM_PRIORITY);

		t5.setPriority(Thread.MIN_PRIORITY);
		t6.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}

class YieldRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(("Current Thread : " + Thread.currentThread().getName() + " Priority : "
				+ Thread.currentThread().getPriority()));
		Thread.yield();
		System.out.println(("Current Thread : " + Thread.currentThread().getName() + " Priority : "
				+ Thread.currentThread().getPriority()) + " -----> END");

	}

}
