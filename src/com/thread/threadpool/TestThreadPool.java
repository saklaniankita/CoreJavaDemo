package com.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 1)Java provides the Executor framework which is centered around the Executor
 * interface, its sub-interface –ExecutorService and the
 * class-ThreadPoolExecutor, which implements both of these interfaces. By using
 * the executor, one only has to implement the Runnable objects and send them to
 * the executor to execute.
 * 
 * 2)They allow you to take advantage of threading, but focus on the tasks that
 * you want the thread to perform, instead of thread mechanics.
 * 
 * 3)To use thread pools, we first create a object of ExecutorService and pass a
 * set of tasks to it. ThreadPoolExecutor class allows to set the core and
 * maximum pool size.The runnables that are run by a particular thread are
 * executed sequentially.
 * 
 * 
 * Steps to be followed
 * 
 * 1. Create a task(Runnable Object) to execute
 * 
 * 2. Create Executor Pool using Executors
 * 
 * 3. Pass tasks to Executor Pool
 * 
 * 4. Shutdown the Executor Pool
 * 
 * Executor Thread Pool Methods:
 * 
 * 1. newFixedThreadPool(int) Creates a fixed size thread pool
 * 
 * 2. newCachedThreadPool() Creates a thread pool that creates new threads as
 * needed, but will reuse previously constructed threads when they are available
 * 
 * 3. newSingleThreadExecutor() Creates a single thread.
 * 
 * In case of a fixed thread pool, if all threads are being currently run by the
 * executor then the pending tasks are placed in a queue and are executed when a
 * thread becomes idle.
 * 
 * @author Ankita
 * 
 */
public class TestThreadPool {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);// creating a
		// pool of 5
		// threads
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread("" + i);
			executor.execute(worker);// calling execute method of
			// ExecutorService
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}
}