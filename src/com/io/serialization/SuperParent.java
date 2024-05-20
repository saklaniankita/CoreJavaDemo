package com.io.serialization;

//import java.io.Serial;
import java.io.Serializable;

public class SuperParent implements Serializable {
	int superA = 9;
	String superB = "HeySuperParent";

	public SuperParent() {
		System.out.println("SuperParent Default Constructor " + superA + "   " + superB);
	}
}
