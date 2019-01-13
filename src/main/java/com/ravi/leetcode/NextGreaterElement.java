package com.ravi.leetcode;

import java.util.Scanner;

public class NextGreaterElement {

	static void nextGreater(int[] a) {
		int l = a.length;
		if (l == 0 || l == 1) {
			System.out.print(-1);
			return;
		}
		int i = 0;
		while (i < l - 1) {
			for (int j = i + 1; j < l; j++) {
				if (a[j] > a[i]) {
					System.out.print(a[j] + " ");
					break;
				}
				if (j == l - 1) {
					System.out.print(-1+" ");
				}
			}
			i++;
		}
		System.out.println(-1);

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int i = 0;
		while (i < t) {
			int n = s.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = s.nextInt();
			}
			nextGreater(a);
			i++;
			System.out.println();
		}

	}

}
