package com.object.clone;

/**
 * Normal constructor only initializes but copyconstructor can create copy at
 * any point of execution This constructor can take only one parameter, which is
 * a reference to an object of the same class.
 * 
 * Copy constructors are better than Object.clone() because they:
 * 
 * Don’t force us to implement any interface or throw any exception, but we can
 * surely do it if it is required. Don’t require any casts. Don’t require us to
 * depend on an unknown object creation mechanism. Don’t require parent classes
 * to follow any contract or implement anything. Allow us to MODIFY FINAL
 * FIELDS. Allow us to have complete control over object creation, meaning we
 * can write our initialization logic in it.
 * 
 * 
 * @author Ankita
 * 
 */
public class CopyConstructor {
	int data1;
	int data2;
	final int data3;

	// default constructor
	public CopyConstructor() {
		this.data1 = 1;
		this.data2 = 2;
		this.data3 = 3;
	}

	// The usual constructor
	public CopyConstructor(int data1, int data2, int data3) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}

	// Copy Constructor
	public CopyConstructor(CopyConstructor copy) {
		this.data1 = copy.data1;
		this.data2 = copy.data2;
		this.data3 = 1 + copy.data3; // final field can also be modified
	}

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public int getData2() {
		return data2;
	}

	public void setData2(int data2) {
		this.data2 = data2;
	}

	public int getData3() {
		return data3;
	}

	public String toString() {
		return this.data1 + ", " + this.data2 + ", " + this.data3;
	}

	public static void main(String[] args) {
		CopyConstructor copy1 = new CopyConstructor(10, 20, 30);
		System.out.println("copy1 : " + copy1);
		CopyConstructor copy2 = new CopyConstructor(copy1);
		System.out.println("copy2 : " + copy2);
		copy1.setData1(11);
		copy1.setData2(12);
		CopyConstructor copy3 = new CopyConstructor(copy1);
		System.out.println("copy3 : " + copy3);
		System.out.println("copy2 : " + copy2);
	}
}
