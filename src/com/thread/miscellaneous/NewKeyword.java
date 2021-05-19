package com.thread.miscellaneous;

/**
 * 
 * @author Ankita
 * 
 */
public class NewKeyword {
	public static void main(String[] args) {

		// obj is just a variable of class NewKeyword. This variable can not be
		// called an object.
		NewKeyword obj;

		// The new operator instantiates a class by dynamically allocating(i.e,
		// allocation at run time) memory for a new object and returning a
		// reference to that memory. This reference is then stored in the
		// variable. Thus, in Java, all class objects must be dynamically
		// allocated.
		// The new operator is also followed by a call to a class constructor,
		// which initializes the new object.
		obj = new NewKeyword();
	}
}
