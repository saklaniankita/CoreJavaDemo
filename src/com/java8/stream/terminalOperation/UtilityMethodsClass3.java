package com.java8.stream.terminalOperation;

import com.java8.Course;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class UtilityMethodsClass3 {
    public static void main(String[] args) {
        int MIN = Integer.MAX_VALUE;
        List<Course> courses = List.of(
                new Course("Spring", "Framework", 96, 45),
                new Course("Spring Boot", "Framework", 97, 50),
                new Course("AWS", "Cloud Service", 94, 50),
                new Course("Google Cloud", "Cloud Service", 92, 234),
                new Course("Microservices", "Framework", 97, 45),
                new Course("Docket", "Tool", 91, 78),
                new Course("Python", "Language", 93, 28),
                new Course("Azure", "Cloud Service", 98, 88),
                new Course("C++", "Language", 91, 90)
        );

        Predicate<Course> reviewScorePredicate = course -> course.getReviewScore() > 95;
        Predicate<Course> cloudCategoryPredicate = course -> course.getCategory().equals("Cloud Service");
        Comparator<Course> minReviewScore = Comparator.comparingInt(Course :: getReviewScore);


        System.out.print("Total No of Students under Cloud Service Category: ");
        System.out.println(courses.stream().filter(cloudCategoryPredicate).mapToInt(course -> course.getNoOfStudents()).sum());

        System.out.print("Average No of Students under Cloud Service Category: ");
        System.out.println(courses.stream().filter(cloudCategoryPredicate).mapToInt(course -> course.getNoOfStudents()).average());

        System.out.print("Types of Courses with Cloud Service Category: ");
        System.out.println(courses.stream().filter(cloudCategoryPredicate).count());

        System.out.print("Maximum No of Students under Cloud Service Category: ");
        System.out.println(courses.stream().filter(cloudCategoryPredicate).mapToInt(course -> course.getNoOfStudents()).max());

        System.out.print("Minimum No of Students under Cloud Service Category: ");
        System.out.println(courses.stream().filter(cloudCategoryPredicate).mapToInt(course -> course.getNoOfStudents()).min());

        System.out.print("Course with category cloud service and minimum Review score: ");
        System.out.println(courses.stream().filter(cloudCategoryPredicate).min(minReviewScore));

        System.out.print("Minimum Review Score under category Cloud Service: ");
        System.out.println(courses.stream().filter(cloudCategoryPredicate).mapToInt(course -> course.getReviewScore()).min());


    }
}
