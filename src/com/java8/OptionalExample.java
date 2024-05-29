package com.java8;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[]{1,2,3};
        System.out.println(findFirstElement(array1));

        /**
         * Using an Optional An empty array will not result into NullPointerException
         * Rather it will return an empty Optional i.e Optional.empty
         */
        Integer[] array2 = new Integer[]{};
        System.out.println(findFirstElement(array2));
    }

    /**
     * This method returns an Optional
     * @param array
     * @return
     */
    static Optional<Integer> findFirstElement(Integer[] array){
        return Arrays.stream(array).findFirst();
    }

}
