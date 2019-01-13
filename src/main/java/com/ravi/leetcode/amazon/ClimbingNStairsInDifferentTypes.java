package com.ravi.leetcode.amazon;

public class ClimbingNStairsInDifferentTypes {

	public static int climbStairs(int n) {

		int num = 0;
		int a = 1;
		int b = 1;
		for (int i = 2; i <= n; i++) {
			num = a + b;
			a = b;
			b = num;
		}
		return num;
	}
	public static void main(String[] args) {

		System.out.println(climbStairs(6));
	}
}
