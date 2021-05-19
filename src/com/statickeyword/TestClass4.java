package com.statickeyword;

/**
 * inner no static class can access both static  & non static memebers of outer class
 * 
 * inner Static class can access ONLY static members of outer class directly
 * To access non static memebers of outer class, First instantiate the outer class then access
 * @author Ankita
 *
 */
public class TestClass4 {
	private int a=1;
	private static int b =2;
	
	class One{
		public void show() {
			System.out.println("I am Non static inner class "+a+"----"+b);
		}
	}
	
	static class Two{
		public void show() {
			TestClass4 x = new TestClass4();
			System.out.println(x.a);
			System.out.println("I am static inner class OR Nested class "+b);
		}
	}
	public static void main(String[] args) {
		TestClass4.One obj1 = new TestClass4().new One();
		obj1.show();
		
		TestClass4.Two obj2 = new TestClass4.Two();
		obj2.show();
	}
}
