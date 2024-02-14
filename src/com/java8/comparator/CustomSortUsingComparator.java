package com.java8.comparator;

import com.java8.Course;

import java.util.Comparator;
import java.util.List;

public class CustomSortUsingComparator {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework",96,45),
                new Course("Spring Boot", "Framework",97,50),
                new Course("AWS", "Framework",94,50),
                new Course("Google Cloud", "Framework",92,234),
                new Course("Microservices", "Framework",97,45),
                new Course("Docket", "Framework",91,78)
        );

        System.out.println("compareByNoOfStudents: ");
        Comparator<Course> compareByNoOfStudents =
                Comparator.comparingInt(Course :: getNoOfStudents);
        courses.stream().sorted(compareByNoOfStudents).forEach(System.out::print);

        System.out.println("/n/n");
        System.out.println("compareByNoOfStudentsInReverseOrder: ");
        Comparator<Course> compareByNoOfStudentsInReverseOrder =
                Comparator.comparingInt(Course :: getNoOfStudents).reversed();
        courses.stream().sorted(compareByNoOfStudentsInReverseOrder).forEach(System.out::print);

        System.out.println("/n/n");
        System.out.println("compareByNoOfStudentsAndReviewScore: ");
        Comparator<Course> compareByNoOfStudentsAndReviewScore =
                Comparator.comparingInt(Course :: getNoOfStudents).thenComparingInt(Course::getReviewScore);
        courses.stream().sorted(compareByNoOfStudentsAndReviewScore).forEach(System.out::println);

        System.out.println("/n/n");
        System.out.println("compareByNoOfStudentsAndReviewScoreInReverse: ");
        Comparator<Course> compareByNoOfStudentsAndReviewScoreInReverse =
                Comparator.comparingInt(Course :: getNoOfStudents)
                        .thenComparingInt(Course::getReviewScore)
                        .reversed();
        courses.stream().sorted(compareByNoOfStudentsAndReviewScoreInReverse).forEach(System.out::println);
    }
}
