package com.object.clone;

public class ToStringTwo {
	String name;
	int id;

	public ToStringTwo(String name, int id) {
		this.id = id;
		this.name = name;
	}

	/**
	 * If we do not override toString method, then the original implementation of
	 * toString method in Object class returns the hashcode value of the object
	 * which is not readable
	 */
	public String toString() {
		return name + " " + id;
	}

	public static void main(String[] args) {
		ToStringTwo one = new ToStringTwo("abc", 19);
		System.out.println(one);
	}

}
