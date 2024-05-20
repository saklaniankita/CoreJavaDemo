package com.java8.functionalProgramming;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Supplier<T> is a functional interface with abstract method: T get()
 *
 * Stream interface has following method:
 *     static Stream<T> generate(Supplier<T> s)
 *
 *
 *
 *
 * @author ankitasaklani
 */
public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt();
        };

        Stream.generate(supplier).forEach(System.out::println);

    }
}
