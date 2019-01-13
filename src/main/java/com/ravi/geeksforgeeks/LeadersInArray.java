package com.ravi.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

	static List<Integer> leadersList(int[] a) {

		List<Integer> leaders = new ArrayList<Integer>();

		int len = a.length;

		if (len == 0)
			return leaders;
		int last = a[len - 1];
		leaders.add(last);
		for (int i = len - 2; i >= 0; i--) {

			if (a[i] > last) {
				leaders.add(a[i]);
				last = a[i];
			}

		}

		return leaders;
	}

	public static void main(String[] args) {
		int[] a = { 16, 17, 4, 3, 5, 2 };
		System.out.println(leadersList(a));
	}
}
