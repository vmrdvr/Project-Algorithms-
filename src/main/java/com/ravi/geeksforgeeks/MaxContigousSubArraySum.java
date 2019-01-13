package com.ravi.geeksforgeeks;

public class MaxContigousSubArraySum {

	static int maxSum(int[] a) {
		if (a.length == 0)
			return 0;
		if (a.length == 1)
			return a[0];

		int curr = a[0];
		int sum = a[0];
		for (int i = 1; i < a.length; i++) {
			curr = Math.max(curr + a[i], a[i]);
			sum = Math.max(curr, sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a = { -10, 2, 3, -2, 5 };
		System.out.println(maxSum(a));
	}

}
