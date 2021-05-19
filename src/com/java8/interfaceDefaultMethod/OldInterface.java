package com.java8.interfaceDefaultMethod;

public interface OldInterface {
	public void existingMethod();

	default void newJava8Method(int a) {
		a = a + 2;
		System.out.println("I am an implemented method of interface " + a);
	}

	default void newJava8Method1(int a) {
		a = a + 2;
		System.out.println("I am an implemented method of interface " + a);
	}
	
	default void newJava8Method2(int a) {
		a = a + 10;
		System.out.println("I am an implemented method of interface " + a);
	}
}
