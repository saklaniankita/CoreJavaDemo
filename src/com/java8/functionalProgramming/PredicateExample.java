package com.java8.functionalProgramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 3, 2, 4, 7, 22, 11, 7, 8, 9, 10);


        /**
         * older method to define a Predicate
         * Predicate<Integer> predicate = new Predicate<Integer>(){
         *      @Override
         *             public boolean test(Integer x) {
         *                 return x % 2 == 0;
         *             }
         *         };
         *
         */

        /**
         * Java 8 method to define a Predicate using Lambda function
         */
        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
        filterAndPrint(list, evenPredicate);

        Predicate<Integer> oddPredicate = x -> x % 2 != 0;
        filterAndPrint(list, oddPredicate);

        Predicate<Integer> multiplesOf3 = x -> x % 3 == 0;
        filterAndPrint(list, multiplesOf3);


    }

    private static void filterAndPrint(List<Integer> list, Predicate<Integer> predicate) {
        list.stream().filter(predicate).forEach(System.out::println);
    }


}