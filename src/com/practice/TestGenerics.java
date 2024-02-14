package com.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("gsdhg");
        test(list);
    }

    static void test(List<? extends Object> obj){
        System.out.println(obj.getClass());
    }
}
