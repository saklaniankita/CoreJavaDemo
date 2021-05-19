package com.example;

public class ClassZ {
	ClassZ() {
		System.out.println("classZ");
	}

	ClassZ(int x) {
		System.out.println("Classz " + x);
	}

	public static void main(String[] args) {
		ClassX v = new ClassX();
	}
}

class ClassY extends ClassZ {
	public ClassY() {
		System.out.println("ClassY");
	}

	ClassY(int x) {
		super(70);
		System.out.println("ClassY " + x);
	}
}

class ClassX extends ClassY {
	public ClassX() {
		super(5);
		System.out.println("ClassX");
	}

	ClassX(int x) {
		System.out.println("ClassX " + x);
	}

}
