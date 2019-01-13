package com.ravi.geeksforgeeks;

import java.util.Arrays;
import java.util.Comparator;

public class ArrangeNumbersToFormAString {

	static void print(int[] a) {
		if (a.length == 0)
			return;
		String[] arr = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			arr[i] = String.valueOf(a[i]);
		}
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				
				return (b + a).compareTo(a + b);
			}
		});
		String output = "";
		int i = 0;
		while (i < arr.length) {
			output = output + arr[i];
			i++;
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		int[] a = { 10, 1, 4, 98, 34, 12, 43 };
		print(a);
	}
}
