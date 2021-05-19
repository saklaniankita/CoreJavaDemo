package com.example;

public class HideField {

	public static class A {
		String name = "a";

		public void doIt1() {
			System.out.println(name);
		};

		public void doIt2() {
			System.out.println(name);
		};
	}

	public static class B extends A {
		String name = "b";

		public void doIt2() {
			System.out.println(name);
		};
	}

	public static void main(String[] args) {
		A a = new B();
		B b = new B();

		a.doIt1(); // print a
		b.doIt1(); // print a
		a.doIt2(); // print a
		b.doIt2(); // print b <-- B.name hides A.name
	}
}