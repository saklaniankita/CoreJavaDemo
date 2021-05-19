package com.thread.miscellaneous;

/*
 * Runtime.gc() also performs same function as System.gc(). In fact System.gc() internally calls Runtime.gc()
 * 
 * Runtime.gc is an instance method whereas System.gc() is a class method
 * 
 * @author Ankita
 *
 */
public class ObjectDeletion {
	public static void main(String[] args) {
		String str = new String("TestDelete");
		System.out.println("str before setting it to null : " + str);
		str = null;
		System.out.println("str after setting it to null : " + str);
		System.out.println("Free Mmeory Before :" + Runtime.getRuntime().freeMemory());

		/**
		 * This will explicitly call garbage collector to remove all unused objects and
		 * free the memory occupied by them
		 */
		System.gc();
		System.out.println("Free Memory after :" + Runtime.getRuntime().freeMemory());

		// This is another way to call garbage collector. Though System.gc() is
		// always preferred
		Runtime.getRuntime().gc();
		System.out.println("Free Memory after :" + Runtime.getRuntime().freeMemory());

		Runtime.getRuntime().gc();
		System.out.println("Free Memory after :" + Runtime.getRuntime().freeMemory());

		Runtime.getRuntime().gc();
		System.out.println("Free Memory after :" + Runtime.getRuntime().freeMemory());
	}
}
