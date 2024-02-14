package com.blocks;

/**
 * First Static block runs in sequence as they appear in the programme Static
 * block runs only once. Then Constructor block runs before the Constructor every
 * time "new" keyword is used. Both Constructor & static blocks run in sequence
 * 
 * STATIC blocks(in sequence) > CONSTRCUTOR Blocks(in sequence) > Constructors
 * 
 * Static fields are initialized according to their placement in the code (See GFG.java)
 * 
 * @author Ankita
 *
 */
class BlocksExample {

	BlocksExample(int x) {
		System.out.println("ONE argument constructor");
	}

	BlocksExample() {
		System.out.println("No  argument constructor");
	}

	static {
		System.out.println("1st static init");
	}

	{
		System.out.println("1st instance init");
	}

	{
		System.out.println("2nd instance init");
	}

	static {
		System.out.println("2nd static init");
	}

	public static void main(String[] args) {
		new BlocksExample();
		new BlocksExample(8);
	}
}