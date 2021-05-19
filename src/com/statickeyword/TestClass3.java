package com.statickeyword;

public class TestClass3 {
	class One{
		public void show() {
			System.out.println("I am Non static inner class");
		}
	}
	
	static class Two{
		public void show() {
			System.out.println("I am static inner class OR Nested class");
		}
	}
	public static void main(String[] args) {
		TestClass3.One obj1 = new TestClass3().new One();
		obj1.show();
		
		TestClass3.Two obj2 = new TestClass3.Two();
		obj2.show();
	}
}
