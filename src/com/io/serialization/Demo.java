package com.io.serialization;

class Demo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private int a;
	private String b;

	// Default constructor
	public Demo(int a, String b) {
		System.out.println("Constructor for DEmo class called");
		this.a = a;
		this.b = b;
	}

	public Demo() {
		System.out.println("Default Constructor for Demo class called....");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

}