package com.thread.concurrentpackage.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread implements Runnable {
    private final BlockingQueue<Integer> queue;

    public ConsumerThread(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Consuming thread " + queue.peek());
            try {
                queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
