package com.collections;

import java.util.ArrayList;


public class ArraySize {
	private static final Integer CAPACITY = 5;

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(CAPACITY);
		System.out.println("SIZE 1: " + list.size());
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("SIZE 2: " + list.size());
		
		//Capacity will be increased by 50% because no. of elements in the array
		//has crossed the initial capacity.
		list.add(5);
		System.out.println("SIZE 3: "+list.size());
	}
}
