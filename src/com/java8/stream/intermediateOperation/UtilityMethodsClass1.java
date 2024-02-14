package com.java8.stream.intermediateOperation;



import com.java8.Course;

import java.util.Comparator;
import java.util.List;

/**
 * limit(), skip(), takeWhile(), dropWhile()
 */
public class UtilityMethodsClass1 {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework",96,45),
                new Course("Spring Boot", "Framework",97,50),
                new Course("AWS", "Framework",94,50),
                new Course("Google Cloud", "Framework",92,234),
                new Course("Microservices", "Framework",97,45),
                new Course("Docket", "Framework",91,78),
                new Course("Python", "Framework",93,28),
                new Course("Azure", "Framework",98,88)
        );

        Comparator<Course> compareByNoOfStudents =
                Comparator.comparingInt(Course :: getNoOfStudents);
        courses.stream().sorted(compareByNoOfStudents).limit(5).forEach(System.out::println);
        System.out.println("***********");
        courses.stream().sorted(compareByNoOfStudents).skip(5).forEach(System.out::println);
        System.out.println("############");
        courses.stream().skip(3).limit(2).forEach(System.out::println);
        System.out.println("@@@@@@@@@@@@@");
        courses.stream().takeWhile(course -> course.getReviewScore() >= 95).forEach(System.out::println);
        System.out.println("***********");
        courses.stream().dropWhile(course -> course.getReviewScore() >= 95).forEach(System.out::println);
    }
}
