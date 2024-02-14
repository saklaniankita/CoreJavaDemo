package com.java8.lambdafunction;

/**
 * Functional interface has just ONE UNIMPLEMENTED method and any number of
 * default or static methods or private methods.
 *
 * 
 * IMPORTANT : Lambda Expressions can be assigned only to Functional interface
 *           EX: Runnable, Comparable<T>
 * 
 * @FunctionalInterface is the annotation for functional interface Lambda
 *                      functionality is used for functional interface only. It
 *                      can have one or more implemented methods
 * 
 *                      for syntax simplicity/Less coding
 * 
 * @author Ankita
 *
 */
public class LambdaTest {
	public static void main(String[] args) {
		Task t1 = new Task();
		Thread th1 = new Thread(t1);
		th1.start();

		// inner class
		Runnable t2 = new Runnable() {
			public void run() {
				System.out.println("task t2 executed");
			}
		};
		Thread th2 = new Thread(t2);
		th2.start();

		// lambda
		Runnable t3 = () -> {
			System.out.println("task t3 executed");
		};
		Thread th3 = new Thread(t3);
		th3.start();

		//
		Runnable t4 = () -> System.out.println("task 4");
		Thread th4 = new Thread(t4);
		th4.start();

		//
		new Thread(() -> System.out.println("task 5")).start();

		System.out.println("done..");
	}
}
