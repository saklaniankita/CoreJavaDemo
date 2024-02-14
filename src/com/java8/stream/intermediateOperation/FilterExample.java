package com.java8.stream.intermediateOperation;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Intermediate operation filter(), map(),
 * <p>
 * filter accepts "Predicate<t>" as its argument
 *
 * @author Ankita
 */
public class FilterExample {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(-1, 1, 21, 22, 34, -21, 54, 0, 53, 2, 22, 11, 13);
//		Predicate<Integer> condition = new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				if ((t > 0)&& (t%2 == 0))
//					return true;
//				return false;
//			}
//
//		};

        Predicate<Integer> condition1 = (t) -> {
            if ((t > 0) && (t % 2 == 0))
                return true;
            return false;
        };

        Predicate<Integer> condition2 = (t) -> {
            if ((t > 0) && (t % 2 != 0))
                return true;
            return false;
        };

        // Printing as list
        List<Integer> result = num.stream().filter(condition1).collect(Collectors.toList());
        System.out.println(result);

        // Printing as standalone numbers
        num.stream().filter(condition1).forEach(System.out::println);

        //Applying map function after filter
        System.out.println("Printing Squares of positive odd Numbers: ");
        num.stream().filter(condition2).map(n -> (n * n)).forEach(System.out::println);

        //Applying map function after filter with in built predicate
        System.out.println("Printing Squares of positive odd Numbers without the use of Predicate: ");
        num.stream().filter(n -> (n > 0)).filter(n -> (n % 2 != 0)).map(n -> (n * n)).forEach(System.out::println);
    }
}
