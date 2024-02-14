package com.thread.concurrentpackage.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 *
 * @author Ankita
 *
 */
public class TestThreadPool {
	public static void main(String[] args) {
		//ExecutorService threadPool = Executors.newFixedThreadPool(5);// creating a
		// pool of 5
		// threads
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		//ExecutorService threadPool = Executors.newCachedThreadPool();
		//ExecutorService threadPool = Executors.newScheduledThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable task = new WorkerThread("" + i);
			threadPool.execute(task);// calling execute method of
			// ExecutorService
		}
		threadPool.shutdown();

		System.out.println("Finished all threads");
	}
}