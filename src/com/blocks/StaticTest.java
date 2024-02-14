package com.blocks;

/**
 * Static variable or static block....whichevr is coded first, executes first
 * If we comment LINE 1, then compilation error will be shown as var1 is yet not declared.
 * If we comment LINE 2, then NO compilation error as var1 is already declared
 *
 * @author Ankita
 */
public class StaticTest {
    private static int var1 = 10; //LINE 1

    static {
        System.out.println("First Static Block: " + var1);
    }
//    private static int var1 = 10; //Line 2

    public static void main(String[] args) {

    	StaticTest a = new StaticTest();
    }
}
