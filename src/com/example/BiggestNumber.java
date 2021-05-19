package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BiggestNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int test_case = sc.nextInt();
		for (int i = 0; i < test_case; i++) {
			int number = sc.nextInt();
			int swaps = sc.nextInt();
			int swapCount = 0;
			int size = String.valueOf(number).length();
			int num[] = new int[size];
			int[] sorted = new int[size];
			for (int k = size - 1; k >= 0; k--) {
				int tmp = number % 10;
				num[k] = tmp;
				sorted[k] = tmp;
				number = number / 10;
			}
			Arrays.sort(sorted);
			for (int k = size - 1; k >= 0; k--) {
				int sortedNum = sorted[k];
				int sortedIndexToSwap = k - size + 1;

				int count = countNumbers(sorted, sortedNum);
				if (count == 1) {
					int indexToSwap = findNum(num, sortedNum);
					swap(num, indexToSwap, sortedIndexToSwap);
					swapCount++;

				} else {

				}
				if (swapCount >= swaps)
					break;
			}
		}
	}

	private static int countNumbers(int[] sorted, int sortedNum) {
		int count = 0;
		for (int i : sorted) {
			if (i == sortedNum)
				count++;
		}
		return count;
	}

	private static int findNum(int[] num, int sortedNum) {
		int index = -1;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == sortedNum) {
				index = i;
				break;
			}
		}
		return index;
	}

	private static void swap(int[] num, int a, int b) {
		int tmp = num[a];
		num[a] = num[b];
		num[b] = tmp;
	}
}
