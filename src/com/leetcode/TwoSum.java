package com.leetcode;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] result = sumToTarget(new int[]{7, 5, 1, 2, 7, 4, 3}, 9);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sumToTarget(int[] nums, int target) {
        int length = nums.length;
        int[] outputArray = new int[2];
        outerForLoop:
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    outputArray[0] = i;
                    outputArray[1] = j;
                    return outputArray;
                }
            }
        }
        return outputArray;
    }
}
