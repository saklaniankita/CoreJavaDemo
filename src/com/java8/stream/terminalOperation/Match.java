package com.java8.stream.terminalOperation;

import com.java8.Course;

import java.util.List;
import java.util.function.Predicate;

/**
 * allMatch(), noneMatch(), anyMatch()
 */
public class Match {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework",98,45),
                new Course("Spring Boot", "Framework",97,50),
                new Course("AWS", "Framework",94,112),
                new Course("Google Cloud", "Framework",92,234),
                new Course("Microservices", "Framework",97,46),
                new Course("Docket", "Framework",91,78)
        );


        Predicate<Course> noOfStudentsPredicate = course -> course.getNoOfStudents() > 50;
        Predicate<Course> reviewScorePredicate = course -> course.getReviewScore() < 90;
        Predicate<Course> reviewScorePredicate1 = course -> course.getReviewScore() > 97;

        System.out.println(courses.stream().allMatch(noOfStudentsPredicate));
        System.out.println((courses.stream().noneMatch(reviewScorePredicate)));
        System.out.println((courses.stream().anyMatch(reviewScorePredicate1)));
    }
}