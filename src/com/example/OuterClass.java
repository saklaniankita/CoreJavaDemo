package com.example;

class OuterClass {
	private int j = 0;

	public void outerMethod() {
		int i = 0;
		class try1 {
			void hey() {
				System.out.println("innermost" + j);
			}
		}
		try1 t = new try1();
		t.hey();
		System.out.println("Outer class method");
	}

	static class InnerClass {
		public void innerMethod() {
			System.out.println("Inner class method");
		}
	}

	void show() {
		outerMethod();
		InnerClass ic = new InnerClass();
		ic.innerMethod();
	}

	public static void main(String[] args) {
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.innerMethod();
	}
}

class another {
	void show() {
		new OuterClass.InnerClass().innerMethod();
		System.out.println("Other class method");
	}
}
