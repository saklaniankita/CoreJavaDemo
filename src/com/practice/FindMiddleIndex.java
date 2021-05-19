package com.practice;

/*You are given an array of numbers. Find out the array index or position
 where sum of numbers preceding the index is equals to sum of numbers
 succeeding the index.*/
public class FindMiddleIndex {
	public static void main(String[] args) {
		int[] array = new int[] { 2, 6, 4, 5, 8, 7, 5, 8, 3, 6, 7, 9 };
		int index = middleIndex(array);
		if (index != -1)
			System.out.println("Middle Index: " + index + "  Value: " + array[index]);
		else
			System.out.println("There is no Middle Index");
	}

	public static int middleIndex(int[] array) {
		int size = array.length;
		for (int i = 2; i < size - 2; i++) {
			if ((array[i - 1] + array[i - 2]) == (array[i + 1] + array[i + 2])) {
				return i;
			}
		}
		return -1;
	}
}
