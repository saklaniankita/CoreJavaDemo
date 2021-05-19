package com.java8.lambdafunction;

/**
 * OLDER WAY
 * 
 * @author Ankita
 *
 */
public class MyClass {
	public static void main(String[] args) {
		MyInterface myInterface = new MyInterface() {
			public String sayHello(String name) {
				return "Hello "+name;
			}
		};
		System.out.println(myInterface.sayHello("Ankita"));
	}
}
