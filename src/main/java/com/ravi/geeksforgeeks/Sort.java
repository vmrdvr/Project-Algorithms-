package com.ravi.geeksforgeeks;

public class Sort {

	static void sort(int[] a) {
		int len = a.length;
		if (len == 0 || len == 1)
			return;

		for (int i = 0; i < len; i++) {
			for (int j = 1; j < len; j++) {
				if (a[j - 1] > a[j]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}

			}
		}

		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 10, 1, 4, 98, 34, 12, 43 };
		sort(a);
	}
}
