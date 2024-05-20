package com.statickeyword;

 class Child extends Parent{

    public static void test(){
        System.out.println("child method");
    }

    public static void main(String[] args) {
        Child.test();
    }
}
