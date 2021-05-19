 package com.java8.lambdafunction;

import java.util.Comparator;

/**
 * NEW WAY
 * @author Ankita
 *
 */
public class MyNewClass {
	public static void main(String[] args) {
		MyInterface myInterface = (str) -> {
			return "Hello "+str;
		};
		System.out.println(myInterface.sayHello("Ankita"));
	}
}
