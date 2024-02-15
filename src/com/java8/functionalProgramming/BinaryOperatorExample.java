package com.java8.functionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;

/**
 * BinaryOperator is a functional interface in teh package java.util.function
 *
 * @author ankitasaklani
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> agesList = List.of(1, 0, 3, 2, 1, 2, 3);
        BinaryOperator<Integer> binaryOperator = ( x, y ) -> x + y;
        System.out.println(agesList.stream().reduce(0, binaryOperator));
    }
}
