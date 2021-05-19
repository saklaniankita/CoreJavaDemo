package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class Partition {
	private static int[] arr = { 1, 5, 11, 5 };
	private static int[] tmpArr = new int[arr.length];

	public int findPartition() {
		LinkedList q = new LinkedList();

		int sum = 0;
		int MAX = 0;

		for (int i : arr) {
			sum = sum + i;
		}

		if (sum % 2 != 0)
			return 0;
		else {
			for (int i = 0; i < arr.length; i++) {
				MAX = MAX + arr[i];
				if (MAX == (sum / 2)) {
					tmpArr[i] = 1;
					break;
				} else if (MAX > (sum / 2)) {
					MAX = MAX - arr[i];
				} else {
					tmpArr[i] = 1;
					continue;
				}
			}
		}

		for (int i : tmpArr) {
			if (i == 1) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Partition p = new Partition();
		p.findPartition();
		for (int i : tmpArr)
			System.out.print(i + "  ");
	}
}
