package com.example;

public class Reflection {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("com.example.Employee");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
