package com.java8.miscellaneous;

import java.util.stream.IntStream;

public class UsingThreads {
    public static void main(String[] args) throws InterruptedException {
        //CONVENTIONAL WAY
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Conventional Way:");
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getId()+" "+i);
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Thread.sleep(5000);


        //FUNCTIONAL WAY
        Runnable runnable2 = () -> {
            System.out.println("Functional Way:");
            IntStream.range(0, 10)
                    .forEach(i -> System.out.println(Thread.currentThread().getId() + " " + i));
        };
        Thread thread4 = new Thread(runnable2);
        thread4.start();

        Thread.sleep(5000);

        //More concise way
        new Thread(() -> {
            System.out.println("More concise way: ");
            IntStream.range(0, 10)
                    .forEach(i -> System.out.println(Thread.currentThread().getId() + " " + i));
        }).start();

    }
}
