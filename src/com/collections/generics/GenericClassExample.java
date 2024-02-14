package com.collections.generics;

public class GenericClassExample<T> {
    GenericClassExample(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericClassExample<Integer> ex = new GenericClassExample<>(7);
    }
}
