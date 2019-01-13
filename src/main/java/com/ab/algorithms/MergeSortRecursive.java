package com.ab.algorithms;

import java.util.Arrays;

public class MergeSortRecursive {

	static int[] mergeSort(int[] a, int[] b) {

		int[] c = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		return merge(i, j, k, a, b, c);
	}
	static int[] merge(int i, int j, int k, int[] a, int[] b, int[] c) {
		if (i == a.length && j == b.length)
			return c;
		if (i == a.length)
			c[k] = b[j];
		if (j == b.length) {
			c[k] = a[i];
		}
		if (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				c[k] = a[i];
				return merge(++i, j, ++k, a, b, c);
			} else {
				c[k]=b[j];
				return merge(i, ++j, ++k, a, b, c);
			}
		} else {
			if (i < a.length)
				return merge(++i, j, ++k, a, b, c);
			else
				return merge(i, ++j, ++k, a, b, c);
		}
	}

	public static void main(String[] args) {
		int[] A = { 2, 1, 4, 98, 23, 34, 12, 21, 12, 32, 43 };
		int[] B = { 45, 34, 2, 2, 43, 24, 172, 1938, 12, 34, 23, 213, 9373 };
		System.out.println(Arrays.toString(mergeSort(A, B)));
	}

}
