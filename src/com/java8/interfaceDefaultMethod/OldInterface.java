package com.java8.interfaceDefaultMethod;

@FunctionalInterface
public interface OldInterface {
	public void existingMethod();



	default void newJava8Method(int a) {
		a = a + 2;
		System.out.println("I am an implemented method of interface " + a);
	}

	private void privateMethod(){
		System.out.println("I am a private method inside an interface");
	}

	static void staticMethod(){
		System.out.println("I am a static method inside an interface");
	}

	private static void privateStaticMethod(){
		System.out.println("I am a private static method inside an interface");
	}

	default void newJava8Method1(int a) {
		a = a + 2;
		System.out.println("I am an implemented method of interface " + a);
		privateMethod();
		staticMethod();
		privateStaticMethod();
	}
	
	default void newJava8Method2(int a) {
		a = a + 10;
		System.out.println("I am an implemented method of interface " + a);
	}

}
