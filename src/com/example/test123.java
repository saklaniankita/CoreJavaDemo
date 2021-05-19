package com.example;

public class test123 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		System.out.println(a1.equals(a2));

	}
}

class A {
	int i;

	A() {
		this.i = 10;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
