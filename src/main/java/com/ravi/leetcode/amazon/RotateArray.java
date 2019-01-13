package com.ravi.leetcode.amazon;

import java.util.Arrays;

public class RotateArray {

	public static void rotate(int[] nums, int k) {
		if (nums.length == 0)
			return;
		if (nums.length == 1) {
			System.out.println(Arrays.toString(nums));
			return;
		}
		if(nums.length==2){
			int var=nums[1];
			nums[1]=nums[0];
			nums[0]=var;
			System.out.println(Arrays.toString(nums));
			return;
		}
		if (k == 0) {
			System.out.println(Arrays.toString(nums));
			return;
		}

		int i = 0;
		int temp;
		while (i < k) {
			temp = nums[nums.length - 1];
			int j = nums.length-2;
			while (j > 0) {
				nums[j + 1] = nums[j];
				nums[j]=nums[j-1];
				j--;
			}
			nums[0] = temp;
			i++;
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		int[] a = { 1,2 };
		rotate(a, 1);
	}
}
