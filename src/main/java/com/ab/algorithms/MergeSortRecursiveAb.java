package com.ab.algorithms;

import java.util.Arrays;

public class MergeSortRecursiveAb {

	static void mergeSort(int low, int high, int[] A) {

		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(low, mid, A);
			mergeSort(mid + 1, high, A);
			merge(low, mid, high, A);
		}
	}

	static void merge(int low, int mid, int high, int[] A) {
		int[] c = new int[high + 1];
		for (int i = low; i <= high; i++) {
			c[i] = A[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;

		while (i <= mid && j <= high) {
			if (c[i] <= c[j]) {
				A[k] = c[i];
				i++;
			} else {
				A[k] = c[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			A[k] = c[i];
			k++;
			i++;
		}
		while (j <= high) {
			A[k] = c[j];
			k++;
			j++;
		}
	}

	public static void main(String[] args) {

		int[] A = { 2, 1, 4, 98, 23, 34, 12, 21, 12, 32, 43 };
		int low = 0;
		int high = A.length - 1;
		System.out.println(Arrays.toString(A));
		mergeSort(low, high, A);
		System.out.println(Arrays.toString(A));
	}
}
