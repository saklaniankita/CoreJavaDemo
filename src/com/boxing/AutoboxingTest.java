package com.boxing;

public class AutoboxingTest {

	public static void main(String args[]) {

		// Example 1: == comparison pure primitive – no autoboxing
		int i1 = 1;
		int i2 = 1;
		System.out.println("i1==i2 : " + (i1 == i2)); // true

		// Example 2: equality operator mixing object and primitive
		Integer num1 = 1; // autoboxing
		int num2 = 1;
		System.out.println("num1 == num2 : " + (num1 == num2)); // true

		// Example 3: special case - arises due to autoboxing in Java
		Integer obj1 = 1; // autoboxing will call Integer.valueOf() and that
		// value will be cached because it is in the range
		// -127 to +127
		Integer obj2 = 1; // same call to Integer.valueOf() will return same
		// cached Object

		System.out.println("obj1 == obj2 : " + (obj1 == obj2)); // true

		// Example 4: special case - arises due to autoboxing in Java
		Integer obj3 = 256; // 256 is beyond primitive int range and they are
		Integer obj4 = 256; // boxed into two different Integer objects

		System.out.println("obj3 == obj4 : " + (obj3 == obj4)); // false

		// Because of this ambiguity it is always preferred to compare Integers
		// using equals method in post java1.5 code

		// Example 5: equality operator - pure object comparison
		Integer one = new Integer(1); // no autoboxing
		Integer anotherOne = new Integer(1);
		System.out.println("one == anotherOne : " + (one == anotherOne)); // false

	}

}