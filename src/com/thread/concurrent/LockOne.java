package com.thread.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Same thread can acuire the lock again without any error
 * BUT Same thread can NOT acquire the permit again in case of Binary Semaphore
 * 
 * @author Ankita
 *
 */
public class LockOne {
	private static int COUNT = 0;
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		lock.lock(); //Thread acquires lock
		lock.lock(); //SAME thread acquires the lock again
		func();
		lock.unlock();
	}
	 
	public static void func() {
		COUNT++;
		System.out.println("Functions call: "+COUNT);
	}
}
