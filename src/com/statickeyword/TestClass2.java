package com.statickeyword;

/**
 * To access a static variable, You do NOT need instance of class
 * 
 * To access static method, You do NOT need instance of class
 * 
 * Static variable/method belongs to all instances equally, so we do NOT need to create an instance to access static
 * method/variable
 * 
 * @author Ankita
 *
 */
public class TestClass2 {
	public static void main(String[] args) {
		System.out.println(TestClass1.count);
		TestClass1.myMethod();
	}
}
