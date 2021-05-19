package com.thread.concurrent;

import java.util.concurrent.Semaphore;

/**
 * 
 * Binary Semaphores(when No. of permits is just 1) are NON-Re-entrant i.e. 
 * if the same thread tries to acquire the same permit again, it will
 * cause a deadlock as in the following program
 * 
 * Try commenting line 1 and Uncommenting Line 2, programme will run fine. No deadlock.
 * Thats because same thread tries to acquire twice but here, two permits were available
 * 
 * @author Ankita
 *
 */
public class SemaphoreOne {
	private static int COUNT;

	public static void main(String[] args) {
		Semaphore sem = new Semaphore(1); //LINE 1 
		//Semaphore sem = new Semaphore(2); // LINE 2
		try {
			sem.acquire();
			System.out.println(Thread.currentThread().getState());
			sem.acquire();
			func();
			sem.release();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void func() {
		COUNT++;
		System.out.println("Functions call: "+COUNT);
	}
}
