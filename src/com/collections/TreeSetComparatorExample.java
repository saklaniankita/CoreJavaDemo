package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

class Person{
    String name;
    int id;

    public Person(String name, int roll_no) {
        this.name = name;
        this.id = roll_no;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

class PersonIdComparator implements Comparator<Person>{

    @Override
    public int compare(Person p1, Person p2) {
        return p1.id - p2.id;
    }
}


public class TreeSetComparatorExample {
    public static void main(String[] args) {
        Person p1 = new Person("Ama", 2);
        Person p2 = new Person("Lilly", 7);
        Person p3 = new Person("Isla", 1);
        Person p4 = new Person("Willy", 6);
        Person p5 = new Person("Henna", 5);
        Person p6 = new Person("Bob", 8);
        Person p7 = new Person("John", 3);

        TreeSet<Person> set1 = new TreeSet<Person>(new PersonNameComparator());
        set1.add(p1);
        set1.add(p2);
        set1.add(p3);
        set1.add(p4);
        set1.add(p5);
        set1.add(p6);
        set1.add(p7);

        System.out.println("Compared by names: "+set1);

        TreeSet<Person> set2 = new TreeSet<Person>(new PersonIdComparator());
        set2.add(p1);
        set2.add(p2);
        set2.add(p3);
        set2.add(p4);
        set2.add(p5);
        set2.add(p6);
        set2.add(p7);

        System.out.println("Compared by id: "+set2);


    }

}

