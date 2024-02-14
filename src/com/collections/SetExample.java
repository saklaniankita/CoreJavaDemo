package com.collections;

import java.util.*;


/**\
 *
 * Though set accepts one Null value, TreeSet does not accept even one Null value
 * because while inserting Null will be compared to the existing elements to get sorted
 * and NUll can not be compared to any value
 *
 * Also TreeSet gives classCastException if values of different dataypes are added because they
 * will not be Comparable
 *
 * @author ankitasaklani
 */
public class SetExample {
    public static void main(String[] args) {
//        HashSet set1 = new HashSet(); //default value for initial capacity is 16 and load factor is .75
//        HashSet set2 = new HashSet(9);
//        HashSet set3 = new HashSet(9,.90f);
//        set3.add(null);
//
//        LinkedHashSet set4 = new LinkedHashSet();
//        set4.add(null);
//
//        TreeSet set5 = new TreeSet();
//        set5.add(null);  //NullPointerException at this line because TreeSet does not accept null values
//        //because while inserting
//
//        TreeSet set6 = new TreeSet();
//        set6.add(1);
//        set6.add("ama"); //ClassCast Exception at Runtime because can not be sorted
//
//        Collections.synchronizedSet(set1);

        List<? extends Number> list1 = new ArrayList<>();
       // list1.add(10);
        //list1.remove(10);

        List<? super Integer> list2 = new ArrayList<>();
        list2.add(10);
        System.out.println(list2.remove(1));

    }

    void testMethod(List<? super Integer> list){
        list.add(10);
    }
}
