package com.ab.algorithms;

/*
 * Fibonacci series using recursion and Iterative - Recursion takes O(2^n) and iterative only takes O(n).
 */
public class FibonacciRecursion {

	static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n - 2) + fib(n - 1);
	}
	static int fibIter(int n) {
		if (n == 1)
			return n;
		if (n == 0)
			return n;
		int[] a = new int[n + 1];
		a[0] = 0;
		a[1] = 1;
		int sum = 1;
		for (int i = 2; i <= n; i++) {
			a[i] = a[i - 1] + a[i - 2];
			sum = a[i];
		}
		return a[n];
	}

	public static void main(String[] args) {
		Long s = System.currentTimeMillis();
		System.out.println(fib(35));
		Long e = System.currentTimeMillis();
		System.out.println(e - s);
		s = System.currentTimeMillis();
		System.out.println(fibIter(35));
		e = System.currentTimeMillis();
		System.out.println(e - s);
	}
}
