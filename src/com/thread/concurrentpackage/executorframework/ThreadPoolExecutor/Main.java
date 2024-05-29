package com.thread.concurrentpackage.executorframework.ThreadPoolExecutor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Here we will create a Blocking queue(that will hold the tasks)
 * and a ThreadPoolExecutor
 */

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
        for(int i = 1; i <= 30; i++) {
                queue.offer(new Task("Task "+i));
        }

        CustomThreadPoolExecutor es = new CustomThreadPoolExecutor(10, 20, 5 , TimeUnit.SECONDS,queue);
        es.prestartAllCoreThreads();

        es.shutdown();
    }
}
