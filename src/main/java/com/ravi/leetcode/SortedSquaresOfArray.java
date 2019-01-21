package com.ravi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedSquaresOfArray {
	// Time Complexity would be O(nlogn) and be done in O(n).
	public static int[] sortedSquares(int[] A) {

		if (A.length == 0)
			return A;
		int[] output = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			output[i] = A[i] * A[i];
		}
		Arrays.sort(output);
		return output;
	}

	// O(n) solution for the same problem
	public static int[] sortedSquaresinOofN(int[] A) {

		if (A.length == 0)
			return A;

		List<Integer> nList = new ArrayList<Integer>();
		List<Integer> pList = new ArrayList<Integer>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0) {
				nList.add(A[i] * A[i]);
			} else {
				pList.add(A[i] * A[i]);
			}
		}
		int[] output = new int[A.length];
		int i = nList.size() - 1;
		int j = 0;
		int k = 0;
		while (i >= 0 && j < pList.size()) {

			if (nList.get(i) < pList.get(j)) {
				output[k++] = nList.get(i--);
			} else {
				output[k++] = pList.get(j++);
			}
		}

		while (i >= 0) {
			output[k++] = nList.get(i--);
		}
		while (j < pList.size()) {
			output[k++] = pList.get(j++);
		}

		return output;
	}

	public static void main(String[] args) {
		int[] a = { -4, -1, 0, 3, 10 };
		sortedSquaresinOofN(a);
	}
}
