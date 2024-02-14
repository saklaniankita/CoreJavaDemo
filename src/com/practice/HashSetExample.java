package com.practice;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        Person p1 =new Person(1,"Andy");
        Person p2 =new Person(1,"bn");
        Person p3 =new Person(4,"Cindy");
        Person p4 =new Person(10,"Barack");

        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p1);
        set.add(p3);
        set.add(p4);

        System.out.println(set);

//       for(Person p : set){
//           System.out.println(p);
//           if(p.equals(new Person(1,"jgj")))
//               System.out.println(p);
//       }
    }
}
