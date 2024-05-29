package com.thread.concurrentpackage.executorframework.callablefuture;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    private final String taskName;

    public CallableTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String call() throws Exception {
        return "I am " +taskName + " in "+ Thread.currentThread().getName();
    }
}
