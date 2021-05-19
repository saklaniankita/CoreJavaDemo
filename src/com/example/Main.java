package com.example;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.i);
		/*
		 * Employee e1 = new Employee(1); Employee e2; try { e2 = (Employee) e1.clone();
		 * } catch (CloneNotSupportedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } HashSet set = new HashSet(); set.add(e1); set.add(e1);
		 * //System.out.println(e1.hashCode()); //System.out.println(e1.hashCode());
		 * 
		 * System.out.println(set.size());
		 */
		char[] arr = { 'f', 'h', '7', '%' };
		System.out.println(arr.toString());
	}
}
