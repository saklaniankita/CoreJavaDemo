package com.thread.concurrentpackage.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);
        ProducerThread producer = new ProducerThread(queue);
        ConsumerThread consumer = new ConsumerThread(queue);

        new Thread(producer).start();
        Thread.sleep(100);
        new Thread(consumer).start();
    }
}
