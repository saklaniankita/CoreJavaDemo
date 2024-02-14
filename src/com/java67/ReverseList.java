package com.java67;

import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(100);
        list.add(2);
        System.out.println(reverse(list));
    }

    private static List<Integer> reverse(List<Integer> list) {
        List<Integer> reversedList = new LinkedList<>();
        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }


}
