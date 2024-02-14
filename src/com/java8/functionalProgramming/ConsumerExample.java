package com.java8.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> agesList = List.of(21, 23, 42, 41, 65, 32, 28);
        //Finding even ages
        Predicate<Integer> evenPredicate = x -> x % 2 == 0;

        //Printing ages
        Consumer<Integer> consumer = x -> {
            System.out.println("My age is " + x);
        };

        //Increasing ages by 10
        Function<Integer, Integer> newAgeFilter = x -> x + 10;

        agesList.stream().filter(evenPredicate).peek(consumer).map(newAgeFilter).forEach(System.out::println);
    }
}
