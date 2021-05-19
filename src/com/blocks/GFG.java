package com.blocks;

/**
 * What happens first? Initialization of static variable or Exceution of static block
 * Whichever is coded first. Everything i.e  Try executing this program by changing the placement of initializing
 * "testVariable" variable
 * 
 * 
 * 
 * @author Ankita
 *
 */
class MyTest {
//	private static  boolean testVariable = false;
	static {
		initialize();
	}

	private static int sum;

	public static int getSum() {
		initialize();
		return sum;
	}

	private static  boolean testVariable = false;

	private static void initialize() {
		if (!testVariable) {
			for (int i = 0; i < 100; i++)
				sum += i;
			System.out.println(sum);
			testVariable = true;
		}
	}
}

public class GFG {
	public static void main(String[] args) {
		MyTest.getSum();
	}
}