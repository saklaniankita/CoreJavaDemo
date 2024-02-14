package com.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(0,3);
        System.out.println(list);
        System.out.println(list.size());
    }
}
