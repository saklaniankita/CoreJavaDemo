package com.collections;

import java.util.TreeSet;

class Student implements Comparable<Student> {
    String name;
    int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }
}

public class TreeSetComparableExample {
    public static void main(String[] args) {
        Student student1 = new Student("Ama", 21);
        Student student2 = new Student("Bill", 22);
        Student student3 = new Student("Amrita", 22);
        Student student4 = new Student("Zoya", 22);
        Student student5 = new Student("Poll", 22);
        Student student6 = new Student("Lilly", 23);

        TreeSet<Student> set  = new TreeSet<Student>();
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);
        set.add(student6);


        System.out.println(set);


    }
}
