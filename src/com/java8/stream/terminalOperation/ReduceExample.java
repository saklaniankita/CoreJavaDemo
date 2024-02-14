package com.java8.stream.terminalOperation;

import java.util.List;

/**
 * Reduce method : This method is used when we want to reduce the whole stream
 * to a single value using repetitive process
 * <p>
 * sum(), min(), max(), count() etc. are some examples of reduce operations.
 *
 * @author ankitasaklani
 */
public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(-3, 1, 2, -2, -2);
        System.out.println("sum: " + addList_3(list));
        System.out.println("minNum: " + minNum(list));
        System.out.println("sumOfSquares: " + sumOfSquares(list));
        System.out.println("sumOfOddNums: " + sumOfOddNums(list));
    }

    public static int addTwoNumbers(int a, int b) {

        return a + b;
    }

    // Calling user defined method through Method reference
    private static int addList_1(List<Integer> list) {

        return list.stream().reduce(0, ReduceExample::addTwoNumbers);
    }

    // Calling predefined method of Integer class using Method Reference
    private static int addList_2(List<Integer> list) {

        return list.stream().reduce(0, Integer::sum);
    }

    // Using Lambda expression
    private static int addList_3(List<Integer> list) {

        return list.stream().reduce(0, (x, y) -> (x + y));
    }

    private static int maxNum(List<Integer> list) {
        return list.stream().reduce(Integer.MIN_VALUE, (x, y) -> (x > y ? x : y));
    }

    private static int minNum(List<Integer> list) {
        return list.stream().reduce(Integer.MAX_VALUE, (x, y) -> (x < y ? x : y));
    }

    private static int sumOfSquares(List<Integer> list) {
        return list.stream().map(x -> x * x).reduce(0, (x, y) -> (x + y));
    }

    private static int sumOfOddNums(List<Integer> list) {
        return list.stream().filter(x -> x % 2 != 0).reduce(0, (x, y) -> (x + y));
    }
}

