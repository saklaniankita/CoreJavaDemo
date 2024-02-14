package com.java8.stream.intermediateOperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DistinctSorted {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 12, 32, 11, 10, 21, 12);
        List<String> courses = List.of("Spring", "AWS", "Microservices", "Spring boot", "Azure", "Java8", "RESTful Ws");

        System.out.println("Natural sorting: ");
        list.stream().distinct().sorted().forEach(System.out::println);

        System.out.println("Sort in reverse order: ");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("Sort by Length: ");
        courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
    }
}
