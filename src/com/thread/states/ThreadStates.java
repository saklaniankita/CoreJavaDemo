package com.thread.states;

/**
 * NEW thread created but not started 
 * RUNNABLE thread executing in JVM (Running is not a state)
 * TIMED_WAITING when you call Thread.sleep(timeout) or t.wait(timeout) or join(timeout) for the specified time;
 * WAITING: When you call wait() or join().
 *          Thread releases the lock and stays in this state till some other thread calls notify() or notifyAll()
 * TERMINATED thread has exited or finished
 * 
 * @author Ankita
 * 
 */
public class ThreadStates extends Thread {
	public void run() {
		try {
			System.out.println("Thread State 3: " + Thread.currentThread().getState());
			Thread.sleep(5000);
			synchronized (Thread.currentThread()) {
				Thread.currentThread().wait();
				System.out.println("Notified.....WAIT IS OVER ");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThreadStates t = new ThreadStates();
		System.out.println("Thread State 1: " + t.getState());
		t.start();
		System.out.println("Thread State 2: " + t.getState());

		int count = 1;
		boolean isWaiting = true;
		while (isWaiting) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// count = count + 2;
			System.out.println(count * 2 + " seconds elapsed. Thread state : " + t.getState());
			count++;
			if (count == 6) {
				synchronized (t) {
					t.notify();
					isWaiting = false;
				}
			}
		}
		System.out.println("Thread State 4: " + t.getState());

	}
}
