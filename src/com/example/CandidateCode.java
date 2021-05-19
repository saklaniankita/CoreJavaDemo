package com.example;

import java.io.*;
import java.util.*;

public class CandidateCode {
	public static void main(String args[]) throws Exception {

		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		int size = in.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}

		jumpFunction(arr, K);

	}

	public static void jumpFunction(int arr[], int K) {

	}

	public static boolean isPrime(int a) {
		if (a == 0 || a == 1)
			return false;
		else {
			boolean isPrime = true;
			for (int i = a / 2; i > 1; i--) {
				if (a % i == 0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		}
	}
}
