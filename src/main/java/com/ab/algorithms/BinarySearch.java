package com.ab.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	static int binarySearch(int[] a, int key) {

		int l = 0;
		int h = a.length - 1;
		Arrays.sort(a);
		System.out.println("After Sorting the Array : " + Arrays.toString(a));
		return binarySearchRecursively(l, h, a, key);

	}

	static int binarySearchRecursively(int l, int h, int[] a, int key) {

		int mid = (l + h) / 2;
		if (l == h) {

			if (a[mid] == key)
				return mid;
			else {
				System.out.println(key + " Not found in the given array ");
				return -1;
			}

		}
		if (key == a[mid])
			return mid;
		if (key < a[mid])
			return binarySearchRecursively(l, mid - 1, a, key);
		else
			return binarySearchRecursively(mid + 1, h, a, key);

	}

	public static void main(String[] args) {

		int[] A = { 2, 1, 4, 98, 23, 45, 34, 2, 2, 43, 24 };
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		System.out.println("Found at index: " + binarySearch(A, key));
	}
}
