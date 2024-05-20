package com.thread.join;

/**
 * 
 * We can use join() method to make sure that threads execute in a particular
 * order. Before we start second thread , we call join on first thread so that
 * second starts only after first is terminated
 * 
 * Threads may take unreasonably long time to finish, we can put timing (EX:
 * t1.join(2000)) It means if the current thread does not finish its task in 2 seconds
 * then the current thread will go into waiting state and next thread will get a
 * chance to start
 * 
 * Join() methods helps in maintaining thread sequence
 * 
 * @author Ankita
 * 
 */
public class JoinThreadOne implements Runnable {

	public void run() {
		try {
			Thread.sleep(4000);
			System.out.println("Current Thread : " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("************ " + Thread.currentThread().getName());
		Thread t1 = new Thread(new JoinThreadOne(), "one");
		System.out.println("************ " + t1.getName());

		Thread t2 = new Thread(new JoinThreadOne(), "two");
		System.out.println("************ " + t2.getName());

		Thread t3 = new Thread(new JoinThreadOne(), "three");
		System.out.println("************ " + t3.getName());

		// start first thread
		t1.start();
		t1.join(); //Other threads will go into BLOCKED state till t1 finishes execution
		System.out.println(Thread.currentThread().getState());
		System.out.println("Current state of t1 : " + t1.getState());

		// start second thread
		t2.start();
		t2.join(2000); //Other threads will go into BLOCKED state till 2 seconds OR t2 finishes execution
		System.out.println("Current state of t2 : " + t2.getState());

		// start third thread
		t3.start(); //Other threads will go into BLOCKED state till t3 finishes exceution
		System.out.println("Current state of t3 : " + t3.getState());
	}
}
