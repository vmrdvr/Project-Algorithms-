package com.ravi.geeksforgeeks;

public class MissingNumber {
	static void missing(int[] a) {
		if (a.length == 0 || a.length == 0)
			return;

		int num = a[0];
		for (int i = 1; i < a.length; i++) {
			int n = a[i] - num;
			if (n > 1) {

				for (int j = n; j > 1; j--)

					System.out.println("missing number is " + (a[i] - j));
			}
			num = a[i];
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 8, 9 };
		missing(a);
	}
}
