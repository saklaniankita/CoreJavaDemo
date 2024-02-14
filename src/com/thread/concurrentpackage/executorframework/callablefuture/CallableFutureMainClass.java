package com.thread.concurrentpackage.executorframework.callablefuture;

import java.util.concurrent.*;

/**
 * Single Thread Executor ensures sequential thread execution i.e.
 * first thread finishes only then second thread starts
 */
public class CallableFutureMainClass {
        public static void main(String[] args) throws ExecutionException, InterruptedException {
            ExecutorService threadPool1 = Executors.newSingleThreadExecutor();
            ExecutorService threadPool2 = Executors.newSingleThreadExecutor();

//            Future<Integer> future = threadPool.submit(new Callable<Integer>() {
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
                    Thread.sleep(1000);
                    System.out.println("Hello future 1 "+Thread.currentThread().getName());
                }
                return 1;
            });

            Future<Integer> future2 = threadPool2.submit(() -> {
                for(int i=0;i<5;i++){
                    Thread.sleep(1000);
                    System.out.println("Hello future 2 "+Thread.currentThread().getName());
                }
                return 2;
            });

            System.out.println("Waiting for the result...");
            Integer result1 = future1.get();
            System.out.println(result1);

            Integer result2 = future2.get();
            System.out.println(result2);

            threadPool1.shutdown();
        }
    }

