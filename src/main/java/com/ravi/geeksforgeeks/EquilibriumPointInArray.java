package com.ravi.geeksforgeeks;

public class EquilibriumPointInArray {

	static void equilibriumPoint(int[] a) {

		int len = a.length;

		if (len == 0)
			return;
		if (len == 1)
			System.out.println(a[0]);
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += a[i];
		}
		int e = sum / 2;

		int sum2 = 0;
		int to = 0;
		for (int i = 0; i < len; i++) {
			sum2 = sum2 + a[i];
			if (sum2 >= e) {
				sum2 -= a[i];
				to = i;
				break;
			}
		}

		int temp = 0;
		for (int j = to + 1; j < len; j++) {

			temp += a[j];
		}

		if (temp == sum2) {
			System.out.println("Equilibrium occurs at : " + a[e]);
		} else {
			System.out.println("No equilibrium point");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 3, 6, 1, 8, 9 };
		equilibriumPoint(a);

	}

}
