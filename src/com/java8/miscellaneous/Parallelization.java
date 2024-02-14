package com.java8.miscellaneous;

import java.util.stream.LongStream;

/**
 * when we use parallel(), Java splits the stream into multiple streams and execute the operation in those
 * streams in a parallel approach on multiple cores of the machine and finally combine all the results....thus saving time.
 *
 * in traditional approach as shown below
 *              int sum = 0;
 *              for(int num:numbers){
 *                  sum += num;
 *              }
 *              return sum;
 * The addition can not be run on multiple cores because the value of variable "sum" keeps on changing. So we can not use parallel()
 * in here.
 */
public class Parallelization {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        System.out.println(LongStream.rangeClosed(1,1000000000).sum());
        long time2 = System.currentTimeMillis();
        System.out.println("Time taken without parallel() "+ (time2 - time1));

        System.out.println(LongStream.rangeClosed(1,1000000000).parallel().sum());
        long time3 = System.currentTimeMillis();
        System.out.println("Time taken with parallel() "+ (time3 - time2));
    }
}
