package com.java8.stream.intermediateOperation;

import java.util.List;

/**
 * All intermediate operations in java8 are lazy. They get executed only after the terminal operation is executed
 *
 * Here we see that findFirst() is executed first and as soon as it finds the correct match intermediate operations stop executing
 * That is why in this example, courses till Microservices are printed and since Microservices has length greater than 10, it stops
 * executing any further
 */
public class LazyIntermediateOperations {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "AWS", "Microservices", "Spring boot App", "Azure", "Java8", "RESTful Ws");

        System.out.println(courses.stream().filter(course -> course.length()>10).map(String::toUpperCase).findFirst());


        //Now we execute the same operation with peek()
      courses.stream().peek(System.out::println)
                .filter(course -> course.length()>10).map(String::toUpperCase).peek(System.out::println).findFirst();
    }
}