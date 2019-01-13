package com.ab.algorithms;

import java.util.Arrays;

public class BinarySearchRecursive {

	static int search(int[] a, int n) {
		if (a.length == 0)
			return -1;
		int h = a.length - 1;
		int l = 0;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		return find(l, h, a, n);

	}

	static int find(int l, int h, int[] a, int n) {
		if (l == h) {
			if (a[l] == n)
				return l;
			else
				return -1;
		}
		int mid = (l + h) / 2;
		if (n == a[mid])
			return mid;

		if (n < a[mid]) {
			return find(l, mid, a, n);
		} else {
			return find(mid + 1, h, a, n);
		}

	}

	public static void main(String[] args) {

		int[] A = { 10, 1, 4, 98, 23, 34, 12, 21, 32, 43 };
		System.out.println(search(A, 55));

	}
}
