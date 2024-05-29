package com.statickeyword;

public class TestScaler {
    static void check() {
        //System.out.println(number);  // CTE as non-static number is accessed in a static method
        System.out.println(new Scaler().number);  //OK
        System.out.println(Scaler.staticNumber);   //OK
    }

    void check1() {
        System.out.println(Scaler.staticNumber);   //OK
        System.out.println(new Scaler().number); // OK
    }
}
