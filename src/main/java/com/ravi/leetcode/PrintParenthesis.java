package com.ravi.leetcode;

import java.util.Scanner;

public class PrintParenthesis {

	static void brackets(int open, int close, String s) {
		if (open == 0 && close == 0) {
			System.out.print(s);
		}
		if (open > 0) {
			brackets(open - 1, close + 1, s + "(");
		}
		if (close > 0) {
			brackets(open, close - 1, s + ")");
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		brackets(n, 0, "");
	}

}
