package com.thread.concurrentpackage.executorframework.callablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Single Thread Executor ensures sequential thread execution i.e.
 * first thread finishes only then second thread starts
 */
public class CallableFutureMainClass {
        public static void main(String[] args) throws ExecutionException, InterruptedException {
            ExecutorService threadPool1 = Executors.newSingleThreadExecutor();
            ExecutorService threadPool2 = Executors.newFixedThreadPool(2);

//            Future<Integer> future = threadPool1.submit(new Callable<Integer>() {
//                @Override
//                public Integer call() throws Exception {
//                    for(int i=0;i<5;i++){
//                        Thread.sleep(1000);
//                        System.out.println(1);
//                    }
//                    return 1;
//                }
//            });

            //call() method of Callable interface being called using lambda function
            Future<Integer> future1 = threadPool1.submit(() -> {
                for(int i=0;i<5;i++){
                    //Thread.sleep(1000);
                    System.out.println("Hello future 1 "+Thread.currentThread().getName());
                }
               return 111;
            });

            List<CallableTask> callables = new ArrayList<>();
            callables.add(new CallableTask("Reading"));
            callables.add(new CallableTask("sleeping"));
            callables.add(new CallableTask("eating"));
            callables.add(new CallableTask("Running"));

            List<Future<String>> futureList = threadPool2.invokeAll(callables);

            System.out.println("Waiting for the result...");
            Integer result1 = future1.get();
            System.out.println("future1: "+result1);

            for(Future<String> future : futureList){
                System.out.println(future.get());
            }

            threadPool1.shutdown();
            threadPool2.shutdown();
        }
    }

