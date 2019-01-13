package com.ab.algorithms;

import java.util.Arrays;

public class QuickSortRecursive {

	static void quickSort(int l, int h, int[] a) {
		if (l < h) {
			int j = partitioning(l, h, a);
			quickSort(l, j, a);
			quickSort(j + 1, h, a);
		}
	}

	static int partitioning(int l, int h, int[] a) {

		int pivot = a[l];
		int i = l;
		int j = h;
		while (i < j) {
			do {
				i++;
			} while (a[i] <= pivot);
			do {
				j--;
			} while (a[j] > pivot);

			if (i < j) {
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}

		int temp = a[j];
		a[j] = a[l];
		a[l] = temp;
		return j;
	}

	public static void main(String[] args) {
		int[] A = { 10, 1, 4, 98, 23, 34, 12, 21, 32, 43 };
		int l = 0;
		int h = A.length - 1;
		System.out.println(Arrays.toString(A));
		quickSort(l, h, A);
		System.out.println(Arrays.toString(A));
	}
}
