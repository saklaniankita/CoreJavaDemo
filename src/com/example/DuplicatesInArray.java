package com.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Returning only the duplicated elemnet in an array
 */
public class DuplicatesInArray {
    public static void main(String[] args) {
        Set<Integer> resultSet = findDuplicates(new int[]{2, 3, 1, 4, 5, 5, 1, 3});
        System.out.println(resultSet);
    }

    private static Set<Integer> findDuplicates(int[] inputArray) {
        Set<Integer> tempSet = new HashSet<Integer>();
        Set<Integer> resultSet = new HashSet<Integer>();

        for (int i = 0; i < inputArray.length; i++) {
            boolean check = tempSet.add(inputArray[i]);
            if (!check)
                resultSet.add(inputArray[i]);
        }
        if(resultSet.size() == 0)
            resultSet.add(-1);
       return resultSet;
    }
}
