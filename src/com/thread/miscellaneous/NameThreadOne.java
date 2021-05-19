package com.thread.miscellaneous;

/**
 * Current thread inside main method is the main thread. Whereas the current
 * thread inside run method is the thread which has called this run method
 * 
 * DOUBT : when thread t1 calls start() method , a new thread is created which
 * further calls the run method. So inside run() method,
 * Thread.currentThread().getName() should return the name of that new thread.
 * But actually it is returning the name of thread t1 which called the start()
 * method[ and not the run() method ]
 * 
 * @author Ankita
 * 
 */
public class NameThreadOne implements Runnable {

	public void run() {
		try {
			Thread.sleep(500);
			System.out.println("Current Thread inside run(): " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new NameThreadOne(), "MyThreadOne");
		System.out.println("**************1 " + Thread.currentThread().getName());
		System.out.println("t1 thread name : " + t1.getName());
		t1.start();

		Thread t2 = new Thread(new NameThreadOne(), "MyThreadTwo");
		System.out.println("**************2 " + Thread.currentThread().getName());
		System.out.println("t2 thread name : " + t2.getName());
		t2.start();
	}
}
