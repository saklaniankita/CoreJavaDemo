package com.practice;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println(reverse(345));
	}

	public static int reverse(int num) {

		// int digits = 0;
		/*
		 * while(true){
		 * 
		 * }
		 */
		int result = 0;
		int mul1 = 10;
		int mul2 = 100;
		if (num != 0) {
			while (true) {
				int x = num % mul1;
				result = result + (x * mul2);
				if (mul2 == 1)
					return result;
				num = num / 10;
				mul2 = mul2 / 10;
				/*
				 * if(mul2 == 1) return result;
				 */
			}
		} else
			return 0;
	}
}
