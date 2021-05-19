package com.abstractclass;

public class Test implements Java8Interface1 {

	@Override
	public void method1(String str) {
		System.out.println("Hey : " + str);
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.method1("Ankita");
		test.method2();
		Java8Interface1.method3();
	}
}
