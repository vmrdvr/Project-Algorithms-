package com.ravi.geeksforgeeks;

public class OccurancesOfX {
//Time complexity O(u-l*k)
	static void occurs(int l, int u, int n) {

		int count = 0;
		for (int i = l + 1; i < u; i++) { //u-l times
			int f = 0;
			int num = i;
			while (num > 0) {      
				f = num % 10;
				if (f == n)
					count++;
				num = num / 10;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {

		occurs(1, 20, 2);
	}
}
