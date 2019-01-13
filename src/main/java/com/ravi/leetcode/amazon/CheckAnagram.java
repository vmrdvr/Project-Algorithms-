package com.ravi.leetcode.amazon;

import java.util.Arrays;

public class CheckAnagram {

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		if (s.length() == 0 && t.length() == 0)
			return true;
		char[] st = s.toCharArray();
		char[] tt = t.toCharArray();
		Arrays.sort(st);
		Arrays.sort(tt);
		return Arrays.equals(st, tt);
	}

	public static void main(String[] args) {
		System.out.println('c'-'a');
		System.out.println(isAnagram("accc", "acca"));
	}
}
