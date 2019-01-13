package com.ravi.leetcode.amazon;

import java.util.Arrays;

public class ProductOfArrayExceptItself {

	public static int[] productExceptSelf(int[] nums) {

		if (nums == null)
			return null;
		int n = nums.length;

		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			result[i] = 1;
		}
		int prev = 1;
		for (int i = 0; i < n; i++) {

			result[i] = prev;
			prev = prev * nums[i];
		}
		prev = 1;
		for (int i = n - 1; i >= 0; i--) {
			result[i] = result[i] * prev;
			prev = prev * nums[i];
		}
		return result;
	}

	public static void main(String[] args) {

		int[] A = { -1, -1, -1, -1, -1,-1};
		System.out.println(Arrays.toString(productExceptSelf(A)));
	}
}
