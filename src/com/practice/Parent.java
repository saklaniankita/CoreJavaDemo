package com.practice;

/**
 * This class tests the use of instanceOf operator and getClas() method
 * 
 * @author Ankita
 * 
 */
public class Parent {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent pc = new Child();

		System.out.print("c instanceof Child : ");
		System.out.println(c instanceof Child);

		System.out.print("c instanceof Parent : ");
		System.out.println(c instanceof Parent);

		System.out.print("pc instanceof Child : ");
		System.out.println(pc instanceof Child);

		System.out.print("pc instanceof Parent : ");
		System.out.println(pc instanceof Parent);

		System.out.print("p instanceof Child : ");
		System.out.println(p instanceof Child);

		System.out.print("p instanceof Parent : ");
		System.out.println(p instanceof Parent);

		System.out.print("c.getClass() : ");
		System.out.println(c.getClass());

		// IMPORTANT
		System.out.print("pc.getClass() : ");
		System.out.println(pc.getClass());

		System.out.print("p.getClass() : ");
		System.out.println(p.getClass());
	}
}

class Child extends Parent {

}