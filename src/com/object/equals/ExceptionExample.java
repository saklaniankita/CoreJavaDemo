package com.object.equals;

//import com.sun.istack.internal.NotNull;

public class ExceptionExample {
	public static void main(String[] args) {
		String str1 = null;

		//@NotNull
		String str2 = "abc";

		// This does NOT give NullPointerException
		System.out.println("str2.equals(str1) : " + str2.equals(str1));

		// This gives NullPointerException
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
	}
}
