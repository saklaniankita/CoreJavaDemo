package com.object.clone;

/**
 * Object class method.. protected native Object clone() throws
 * CloneNotSupportedException.
 * 
 * You are unable to use clone method inherited from the Object as it is
 * protected and would not be directly accessible. You need to override it and
 * make it public
 * 
 * Class which needs to be cloned should implement a marker interface Cloneable
 * 
 * If we try to clone an instance of a class that does not implement Cloneable
 * interface then it throws CloneNotSupportedException (checked exception)
 * 
 * Constructor is NOT called during cloning
 * 
 * it creates exact copy of an object. If we use new keyword to create a copy it
 * will take lot of processing.
 * 
 * For any object x : 1) x.clone() != x because memory address for both object
 * reference should not be same 2) x.clone().getClass() == x.getClass()
 * 
 * @author Ankita
 * 
 */
public class CloneTwo implements Cloneable {
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int n) {
		this.num = n;
	}

	public CloneTwo(int num) {
		this.num = num;
	}

	public boolean equals(Object c) {
		if (c == this)
			return true;
		else if (!(c instanceof CloneTwo))
			return false;
		else {
			CloneTwo c1 = (CloneTwo) c;
			return c1.num == this.num;
		}

	}

	// Overriding clone() method
	// Since we are not doing anything except calling Object's clone method,
	// program will run correctly even if we don't override clone method in this
	// class. It will automatically take the Object's class implementation
	@Override
	public CloneTwo clone() throws CloneNotSupportedException {
		// calling Object class clone method
		return (CloneTwo) super.clone();
	}

	public static void main(String[] args) {
		CloneTwo c1 = new CloneTwo(20);
		CloneTwo c2 = null;
		try {
			c2 = c1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("c1.getNum() :" + c1.getNum());
		System.out.println("c2.getNum() :" + c2.getNum());

		// Before Sate Change
		System.out.println("Just after cloning......");
		System.out.println("c1 == c2 " + (c1 == c2));
		System.out.println("c1.getClass() == c2.getClass() " + (c1.getClass() == c2.getClass()));
		System.out.println("c2.equals(c1) " + (c2.equals(c1)));

		// After state change
		c2.num = 30;
		System.out.println();
		System.out.println("After changing num value.........");
		System.out.println("c1 == c2 " + (c1 == c2));
		System.out.println("c1.getClass() == c2.getClass() " + (c1.getClass() == c2.getClass()));
		System.out.println("c2.equals(c1) " + (c2.equals(c1)));

	}
}
