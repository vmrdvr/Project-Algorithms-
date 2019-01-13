package com.ravi.geeksforgeeks;

public class FindMax {
	static void find(int[] a) {

		int l = a.length;
		int max = 0;
		int i = 0;
		int count = 0;
		while (i < l) {
			count++;
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < max) {
				break;
			}
			i++;
		}
		System.out.println(max + " No of iterations : " + count);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };
		find(a);
	}
}
