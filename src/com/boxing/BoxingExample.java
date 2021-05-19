package com.boxing;

import java.util.ArrayList;

/**
 * 
 * always prefer primitive over boxed primitive and look for unintentional
 * autoboxing in Java
 * 
 * @author Ankita
 * 
 */
public class BoxingExample {
	public static void main(String[] args) {

		// Collections always take wrapper classes as generics
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1); // autoboxing - primitive to object/Wrapper
		intList.add(2); // autoboxing - primitive to object/Wrapper class

		int number = intList.get(0); // unboxing - Wrapper to primitive
		System.out.println(number);

		Integer a = 5; // Autboxing
		int b = a + 4; // Unboxing

		// before autoboxing
		Integer iObject1 = Integer.valueOf(3);
		int iPrimitive1 = iObject1.intValue();

		// after java5
		Integer iObject2 = 3; // autobxing - primitive to wrapper conversion
		int iPrimitive2 = iObject2; // unboxing - object to primitive conversion

		show(3); // autoboxing from int to Integer
		int result = show(3); // unboxing because return type of method is
		// Integer

		// methods for both primitive and wrapper will be called according to
		// the argument passed and no autoboxing/unboxing will occur.
		// autoboxing/unboxing will occur only when corresponding exact method
		// is not present
		BoxingExample autoTest = new BoxingExample();
		int value = 3;
		autoTest.test(value); // no autoboxing
		Integer iValue = value;
		autoTest.test(iValue); // no autoboxing

	}

	public static Integer show(Integer iParam) {
		System.out.println("autoboxing example - method invocation i: " + iParam);
		return iParam;
	}

	 public void test(int num) {
	 System.out.println("method with primitive argument");

	 }

	public void test(Integer num) {
		System.out.println("method with wrapper argument");

	}
}
