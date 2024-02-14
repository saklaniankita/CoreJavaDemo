package com.java8.functionalProgramming;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Java8FunctionalInterfaces {
    public static void main(String[] args) {
        //Predicate accepting Single input of ANY Type and returning boolean as output.
        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        Predicate<String> isStringPredicate = str -> str.length() >= 5;

        //Function accepts single input of ANY type and returns single output of ANY type
        //Function accepting Integer as input and returning Integer as output
        Function<Integer, Integer> squareFunction = x -> x*x;

        //Function accepting Integer as input and returning string as output
        Function<Integer, String> stringOutputFunction = x -> "My age is "+x;

        //Consumer accepting single input of ANY type but returning void
        Consumer<Integer> printConsumer = x -> System.out.println(x);

        Consumer<String> printStringConsumer = x -> System.out.println(x);

        //BinaryOperator accepts two inputs and returns one output.
        // Both input and output are of SAME datatype
        BinaryOperator<Integer> sumBinaryOperator = (x,y) -> (x + y);

        //Supplier accepts no input but returns output of ANY type.
        //Supplier randomSupplier = () -> 2;
        Supplier<String> randomSupplier = () -> {
           Random random = new Random();
           int num = random.nextInt(100);
           return "Hello" + num;
        };

        //UnaryOperator takes single input and returns single output of the SAME type
        UnaryOperator<Integer> squareUnaryOperator = x -> x * x;

        //BiPredicate accepting Two inputs of ANY type and returning single boolean as output.
        BiPredicate<Integer,String> biPredicate = (num, str) -> {
            return num > 10 && str.length() > 5;
        };

        //BiFunction accepting Two inputs of ANY type and returning one output of ANY type.
        BiFunction<Integer,String, String> biFunction = (num, str) -> {
            return num + " --- " + str;
        };

        //BiConsumer accepting two inputs of ANY type but returning void
        BiConsumer<Integer, String> biConsumer = (num, str) -> System.out.println(num + "-" + str);

//        System.out.println(isEvenPredicate.test(7));
//        System.out.println(isStringPredicate.test("hey there predicate"));
//        System.out.println(squareFunction.apply(2));
//        System.out.println(stringOutputFunction.apply(50));
//        printConsumer.accept(9);
//        printStringConsumer.accept("hey there consumer");
//        System.out.println(sumBinaryOperator.apply(2, 3));
//        System.out.println(randomSupplier.get());
//        System.out.println(squareUnaryOperator.apply(7));
//        System.out.println(biPredicate.test(11, "hey there bi predicate"));
//        System.out.println(biFunction.apply(4, "hey there bifunction"));
          biConsumer.accept(4, "I am BiConsumer");


        /**
         *Function accepts wrapper classes as input and output
         * IntFunction accepts primitive datatype which is preferable because no need of boxing and unboxing
         *
         */

        Function<Integer, String> func = x -> "My age is "+ x;
        IntFunction intFunc = x -> x+10+"str";
    }

}
