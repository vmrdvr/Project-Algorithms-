package com.ravi.java.sorting;

import java.util.Arrays;

class ArrayBinarySearch {
	public static void main(String args[]) {

		int a[] = {10,24,2,1,5,8,5,7,55,54};// declaration and instantiation
		
		System.out.print(Arrays.toString(a));

		int x = binarySearch(0, a.length - 1, a, 7);
		if (x == 0) {
			System.out.println("Element Not found");
		} else {
			System.out.println("Element found at :" + x + " Index");
		}

	}

	private static int binarySearch(int first, int last, int[] a, int n) {

		Arrays.sort(a);
		if (last >= 1) {
			int mid = first + (last - 1) / 2;

			if (a[mid] == n)
				return mid;
			if (a[mid] > n) {
				return binarySearch(first, mid - 1, a, n);
			} else {
				return binarySearch(mid + 1, last, a, n);
			}

		}
		return 0;
	}
}
