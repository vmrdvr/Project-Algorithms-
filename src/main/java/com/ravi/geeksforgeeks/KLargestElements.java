package com.ravi.geeksforgeeks;

import java.util.Arrays;

public class KLargestElements {

	static void find(int[] a, int k) {
		if (a.length == 0)
			return;
		Arrays.sort(a);
		int n = a.length - 1;
		int i = 0;
		while (i < k) {
			System.out.print(a[n] + " ");
			n--;
			i++;
		}
	}

	public static void main(String[] args) {
		int[] A = { 10, 1, 4, 98, 23, 34, 12, 21, 32, 43 };
		find(A, 2);
	}
}
