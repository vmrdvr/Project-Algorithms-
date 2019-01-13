package com.ravi.leetcode;

public class ReverseString {

	public String reverseString(String s) {
		int len = s.length();

		StringBuilder sb = new StringBuilder();

		for (int j = len - 1; j >= 0; j--) {

			sb.append(s.charAt(j));

		}

		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(new ReverseString().reverseString("my name"));
	}
}
