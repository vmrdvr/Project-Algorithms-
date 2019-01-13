package com.ravi.leetcode.amazon;

public class TrappingRainWater {

	public static int trap(int[] height) {
		int l = height.length;
		if (l == 1 || l == 0)
			return 0;

		int leftmax = height[0];
		int rightmax = height[l - 1];
		int sum = 0;
		int units = 0;
		for (int i = 1; i < l; i++) {
			if (height[i] >= leftmax) {
				leftmax = height[i];
				units = units + sum;
				sum = 0;
			} else {
				sum = (leftmax - height[i]) + sum;
			}
		}
		sum = 0;
		for (int i = l - 2; i >= 0; i--) {
			if (height[i] > rightmax) {
				rightmax = height[i];
				units = units + sum;
				sum = 0;
			} else {
				sum = (rightmax - height[i]) + sum;
			}
		}
		return units;
	}

	public static void main(String[] args) {

		int[] a = {1,2,0,3,1,0,2,3,1};
		System.out.println(trap(a));
	}
}
