package com.example;

public class Moves {
	public static void main(String[] args) {
		System.out.println(FindingMoves(0));
	}

	public static int FindingMoves(int input1) {
		if (input1 == 0)
			return 9;
		int tmp = ((input1 + 1) * (input1 + 2)) / 2;
		return (1 + 8 * tmp);
	}
}
