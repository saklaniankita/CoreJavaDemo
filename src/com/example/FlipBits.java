package com.example;

import java.util.HashMap;

public class FlipBits {
	static int MAX_FLIPS = 3;
	static int N = 3;
	static int[][] matrix = new int[N][N];
	static int Answer = 0;

	public static void main(String[] args) {
		maxOne(0, MAX_FLIPS);
		System.out.println(Answer);
	}

	private static void maxOne(int count, int T) {
		int rowMax = 0;
		if (count > T)
			return;
		else if (count == T) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (matrix[i][j] == 0)
						break;
					else if (j == N) {
						rowMax++;
					}
				}
			}

			if (Answer < rowMax) {
				Answer = rowMax;
			}
		}

		for (int i = 0; i < N; i++) {
			flip(i);
			maxOne(count + 1, T);
			flip(i);
		}

	}

	private static void flip(int col) {
		for (int i = 0; i < N; i++) {
			if (matrix[i][col] == 0)
				matrix[i][col] = 1;
			else
				matrix[i][col] = 0;
		}
		HashMap map = new HashMap();

	}
}
