package com.thread.miscellaneous;

/**
 * 
 * Do note that the thread inside the constructor is always the main thread. So
 * the setName() method inside constructor will set the name of main thread. If
 * you want to set the name of current thread, call super(name) which will call
 * the constructor of class Thread and will set the thread name.
 * 
 * Do test results of following program by commenting either of two lines:- line
 * 19 or line 23 and see the difference in the output
 * 
 * 
 * @author Ankita
 * 
 */
public class NameThreadTwo extends Thread {
	public NameThreadTwo(String name) {
		super(name); // sets the name of current thread
		System.out.println("Thread in the constructor : " + Thread.currentThread().getName());

		// Thread.currentThread().setName(name);
	}

	public void run() {
		try {
			Thread.sleep(500);
			System.out.println("Current Thread : " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		System.out.println("************1 " + Thread.currentThread().getName());
		NameThreadTwo t1 = new NameThreadTwo("one");
		System.out.println("************ " + t1.getName());
		t1.start();
		System.out.println("************2 " + Thread.currentThread().getName());

		NameThreadTwo t2 = new NameThreadTwo("two");
		System.out.println("************ " + t2.getName());
		System.out.println("************3 " + Thread.currentThread().getName());
		t2.start();

		NameThreadTwo t3 = new NameThreadTwo("three");
		System.out.println("************ " + t3.getName());
		t3.start();
		System.out.println("************4 " + Thread.currentThread().getName());
	}
}
