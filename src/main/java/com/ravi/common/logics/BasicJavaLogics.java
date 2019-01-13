package com.ravi.common.logics;

public class BasicJavaLogics {

	// 1 1 2 3 5 8 13 21...

	static void fibonacciSeries(int n) {

		int i = 1, t1 = 0, t2 = 1;

		while (i < n) {

			System.out.print(t1 + "  ");
			int sum = t1 + t2; // 1

			t1 = t2;
			t2 = sum;
			i++;

		}

	}

	static void sumOfNaturals(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {

			sum = sum + i;

		}
		System.out.println(sum);
	}

	static void factorial(int n) {
		int factorial = 1;

		for (int i = 2; i <= n; i++) {

			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

	static void isApallindrome(int n) {
		int newNum = 0;
		int numToCheck = n;
		while (n > 0) {

			newNum = newNum * 10 + n % 10;
			;
			n = n / 10;

		}

		System.out.println(numToCheck);
		if (numToCheck == newNum) {
			System.out.println("Given number : " + numToCheck + "  is a pallindroame");
		} else {
			System.out.println("GIven number is not a pallindrome");
		}

	}

	static void isAarmstrongNumber(int n) {

		int newNum = 0;
		int numToCheck = n;
		int count = 0;
		while (n > 0) {
			newNum = n % 10;
			count += newNum * newNum * newNum;
			n = n / 10;

		}
		if (numToCheck == count) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not an Armstrong");
		}

	}

	public static void main(String[] args) {

		// BasicJavaLogics.fibonacciSeries(20);
		// BasicJavaLogics.sumOfNaturals(1);
		// BasicJavaLogics.factorial(5);
		// BasicJavaLogics.isApallindrome(15152);
		// BasicJavaLogics.isAarmstrongNumber(371);

	}
}
