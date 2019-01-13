package com.ravi.leetcode.amazon.explore;

import java.util.ArrayList;
import java.util.List;

public class HistoryOfTemperatures {

	static List<Integer> warmerDays(int[] a) {
		List<Integer> warm = new ArrayList<Integer>();
		if (a.length == 0)
			return warm;

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					warm.add(j - i);
					count++;
					break;
				}
			}
			if (count != 1)
				warm.add(0);
		}
		return warm;
	}

	public static void main(String[] args) {

		int[] a = { 73, 74, 75, 71, 69, 72, 76, 73 };
		System.out.println(warmerDays(a));

	}
}
