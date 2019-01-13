package com.ravi.leetcode.amazon;

public class FirstNonRepeatingCharacterInAString {

	static int findNonUniqueChar(String s) {

		if (s.length() == 0) {
			return -1;
		}
		if (s.length() == 1)
			return 0;
		int i = 0;
		while (i < s.length()) {
			int j = 0;
			while (j < s.length()) {
				if (i == s.length() - 1 && j == s.length() - 1)
					return i;
				if (i == j) {
					j++;
					continue;
				}
				if (s.charAt(i) == s.charAt(j)) {
					j++;
					break;
				}
				if (j == s.length() - 1)
					return i;
				j++;
			}
			i++;
		}

		return -1;
	}

	public static void main(String[] args) {
		String s = "raveernaravindra";

		System.out.println(findNonUniqueChar(s));

	}
}
