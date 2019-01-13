package com.ravi.leetcode.amazon.explore.others;

public class RotateArray {

	public void rotate(int[] nums, int k) {

		int len = nums.length;
		if(len==0)return;
		k = k % len;
		swap(nums, 0, len - 1);
		swap(nums, 0, k - 1);
		swap(nums, k, len - 1);
	}

	void swap(int[] a, int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}

	}
}
