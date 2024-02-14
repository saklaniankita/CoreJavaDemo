package com.java8.stream.terminalOperation;

import com.java8.Course;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * max() prints the last element after the comparator is applied irrespective of that being maximum or minimum
 * min() prints the first element in the list
 * orElse() returns the given element if the result is empty.
 * findFirst() returns the first element in the list
 * findAny() returns any element from the list
 */
public class UtilityMethodsClass2 {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework",96,45),
                new Course("Spring Boot", "Framework",97,50),
                new Course("AWS", "Framework",94,20),
                new Course("Google Cloud", "Framework",92,234),
                new Course("Microservices", "Framework",97,45),
                new Course("Docket", "Framework",91,78),
                new Course("Python", "Framework",93,28),
                new Course("Azure", "Framework",98,88)
        );

        Comparator<Course> compareByNoOfStudentsAndReviewScore =
                Comparator.comparingInt(Course :: getNoOfStudents).thenComparingInt(Course::getReviewScore);
        System.out.println(courses.stream().max(compareByNoOfStudentsAndReviewScore));
        System.out.println(courses.stream().min(compareByNoOfStudentsAndReviewScore));

        Predicate<Course> reviewScorePredicate = course -> course.getReviewScore() < 80;
        System.out.println(courses.stream().filter(reviewScorePredicate).min(compareByNoOfStudentsAndReviewScore));

        System.out.println(courses.stream()
                .filter(reviewScorePredicate)
                .min(compareByNoOfStudentsAndReviewScore)
                .orElse(new Course("Azure", "Framework",98,88)));

        System.out.println(courses.stream().findFirst());
        System.out.println(courses.stream().findAny());
    }
}
