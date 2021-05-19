package com.io.serialization;

public class Parent extends SuperParent {
	int a = 10;
	String b = "HeyParent";

	Parent() {
		System.out.println("Parent class Default Constructor " + a + "  " + b);
	}
}
