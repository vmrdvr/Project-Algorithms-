package com.ravi.leetcode.amazon;

import java.util.ArrayList;
import java.util.List;

public class CountPrimes {
	public static List<Integer> countPrimes(int n) {
		int count = 0;

		boolean[] a = new boolean[n + 1];
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i < n; i++) {

			if (!a[i]) {
				list.add(i);
				for (int j = 2; i * j < n; j++) {
					a[i * j] = true;
				}
			}
		}

		return list;
	}

	public static void main(String[] args) {

		System.out.println(countPrimes(100));
	}

}
