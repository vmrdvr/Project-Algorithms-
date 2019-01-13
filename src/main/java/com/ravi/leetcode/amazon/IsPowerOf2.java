package com.ravi.leetcode.amazon;

public class IsPowerOf2 {

	public static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;
		if (n == 1 || n == 2)
			return true;
		int count = 0;
		int result = 1;
		if (n % 2 == 0) {
			for (int i = n; i > 0;) {
				count++;
				i = i / 2;
			}
			for (int j = 1; j < count; j++) {
				result = result * 2;
			}
		} else {
			return false;
		}
		return result == n;
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(512));
	}
}
