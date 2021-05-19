package com.example;

public class MyClass {
	static String throwMeThat(String myString) {
		System.out.println(myString);
		return myString;
	}

	public static void main(String[] args) {
		new Third();

	}
}

class First {
	String var1inFirst = MyClass.throwMeThat("var1inFirst");
	String var2inFirst = MyClass.throwMeThat("var2inFirst");

	public First() {
		MyClass.throwMeThat("I am constructor in First class");
	}
}

class Second extends First {
	String var1inSecond = MyClass.throwMeThat("var1inSecond");
	String var2inSecond;

	public Second() {
		MyClass.throwMeThat("I am constructor in Second class");
	}
}

class Third {
	String var1inThird;
	{
		var1inThird = MyClass.throwMeThat("var1inThird");
	}
	String var2inThird;
	String var3inThird = MyClass.throwMeThat("var3inThird");

	public Third() {
		MyClass.throwMeThat("I am constructor in Third class");
		var2inThird = MyClass.throwMeThat("var2inThird");
		// var2inSecond = MyClass.throwMeThat("var2inSecond");
	}
}