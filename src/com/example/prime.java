package com.example;

public class prime {
	static int count = 0;

	public static void main(String[] args) {
		long current = System.currentTimeMillis();
		/*
		 * for(int i=1;i<=100;i++){ if(isPrime(i)) System.out.println(i); //print i if
		 * it is prime }
		 */
		isPrime(15);
		System.out.println(System.currentTimeMillis() - current);
	}

	static boolean isPrime(int i) {
		if (i == 2) // 2 is the only even number which is prime
			return true;
		else if (i % 2 == 0) // if even it is not prime
			return false;
		else {
			count++;// run this loop for odd numbers
			for (int j = i / 2; j > 1; j--) { // loop will start fom i/2 because any number i will have its possible
												// factors before i/2
				if (i % j == 0)
					return false;
				else
					continue;
			}
			return true;
		}
	}
}
