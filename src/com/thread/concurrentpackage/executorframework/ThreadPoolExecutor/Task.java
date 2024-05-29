package com.thread.concurrentpackage.executorframework.ThreadPoolExecutor;

import java.sql.SQLOutput;

public class Task implements Runnable {
    private final String message;

    public Task(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Message: "+message);
    }
}
