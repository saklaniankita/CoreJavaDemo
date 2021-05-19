package com.thread.miscellaneous;

import java.awt.Point;

/**
 * This class shows behaviour of immutable class String. All of the java.lang
 * package wrapper classes are immutable: Boolean, Byte, Character, Double,
 * Float, Integer, Long, Short, String.
 * 
 * @author Ankita
 * 
 */
public class MutationExample {
	public static void main(String[] args) {
		methodOne();
		methodTwo();
		methodThree();
	}

	/**
	 * contents of myPoint does change because Point is a mutable class but contents
	 * of myString does NOT because String is an immutable class
	 */
	static void methodOne() {
		Point myPoint = new Point(0, 0);
		System.out.println(myPoint);
		myPoint.setLocation(1.0, 0.0);
		System.out.println(myPoint);

		System.out.println("Immutable String in MethodOne---->>>>>");
		String myString = new String("old String");
		System.out.println(myString);
		myString.replaceAll("old", "new");
		System.out.println(myString);

		Integer myInt = new Integer(23);
		myInt.reverse(100); // this won't change the myInt value because Integer
							// is also an immutable class
		System.out.println(myInt);
	}

	/**
	 * variable myString is referencing a new instance of the String class. The
	 * contents of the object didn't change; we discarded the instance and changed
	 * our reference to a new one with new contents.
	 */
	static void methodTwo() {
		System.out.println("Immutable String in MethodTwo---->>>>>");
		String myString = new String("old String");
		System.out.println(myString);
		myString = new String("new String");
		System.out.println(myString);

		// Calling system.gc() will garbage collect the unreferenced object and
		// free memory will increase
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory : " + rt.totalMemory() + "   Free Memory : " + rt.freeMemory());
		System.gc();
		System.out.println("Total Memory : " + rt.totalMemory() + "   Free Memory : " + rt.freeMemory());
	}

	/**
	 * What this shows is that variable myString is referencing a new instance of
	 * the String class. Then myCache also pointing to the same object in memory. So
	 * myString and myCache are pointing to the same object.
	 * 
	 * 
	 */
	static void methodThree() {
		System.out.println("Immutable String in MethodThree---->>>>>");
		String myString = new String("old String");
		String myCache = myString;
		System.out.println("equal: " + myString.equals(myCache));
		System.out.println("same:  " + (myString == myCache));

		// myString is now pointing to different object in memory
		myString = "not " + myString;
		System.out.println("equal: " + myString.equals(myCache));
		System.out.println("same:  " + (myString == myCache));
	}
}
