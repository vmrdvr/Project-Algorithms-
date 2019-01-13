package com.ab.algorithms;

import java.util.Arrays;
//Time complexity O(a.length + b.length) Iterative Approach
public class MergeSortIterative {

	static int[] mergeSort(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		int[] c = new int[a.length + b.length];
		if (a.length == 0 || b.length == 0) {
			c = a.length == 0 ? b : a;
			return c;
		} else {
			int k = 0;
			int j = 0;
			int i = 0;
			while (i < a.length && j < b.length) {
				if (a[i] <= b[j]) {
					c[k] = a[i];
					k++;
					i++;
				} else {
					c[k] = b[j];
					k++;
					j++;
				}
			}
			while(i<a.length){
				c[k]=a[i];
				k++;
				i++;
			}
			while(j<b.length){
				c[k]=b[j];
				k++;
				j++;
			}
			return c;
		}
	}

	public static void main(String[] args) {
		int[] A = { 2, 1, 4, 98, 23, 34, 12, 21, 12, 32, 43 };
		int[] B = { 45, 34, 2, 2, 43, 24, 172, 1938, 12, 34, 23, 213, 9373 };

		System.out.println(Arrays.toString(mergeSort(A, B)));

	}

}
