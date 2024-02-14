package com.collections.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class ProducerThread implements Runnable {
    private final BlockingQueue<Integer> queue;

    public ProducerThread(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                queue.add(i);
                System.out.println("Thread "+i+" added");
            }catch(IllegalStateException e){
                System.out.println(i+" Queue is full...waiting for the space to get free.....");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
