package com.java8.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * BinaryOperator<T> is a functional interface with abstract method: T apply(T t, T t)
 * accepts two argument of same type and returns result of same type
 *
 * Stream interface has following method
 * T reduce(T identity, BinaryOperator<T> accumulator)
 *
 *
 * @author ankitasaklani
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> agesList = List.of(1, 0, 3, 2, 1, 2, 3);
        BinaryOperator<Integer> binaryOperatorInteger = ( x, y ) -> x + y;
        System.out.println(agesList.stream().reduce(0, binaryOperatorInteger));

        List<String> nameList = List.of("Ama","Bob","Luke","Isla");
        BinaryOperator<String> binaryOperatorString = (a, b) -> a.concat(b);
        System.out.println(nameList.stream().reduce("",binaryOperatorString));

        Integer[] arr = {1,2,3,4};
        BinaryOperator<Integer> binaryOperatorMultiply = (a, b) -> (a*b);
        System.out.println(Arrays.stream(arr).reduce(1,binaryOperatorMultiply));

        BinaryOperator<Integer> binaryOperator = (x,y) -> (x+y);
        System.out.println(Arrays.stream(arr).reduce(0,binaryOperator));
    }
}
