package com.ravi.leetcode.amazon.explore;

public class KMPPatternSearchingAlgorithm {
	static int search(String s, String toSearch) {
		if (s.length() == 0 || toSearch.length() == 0)
			return 0;
		int i = 0;
		int count = 0;
		while (i < s.length() - toSearch.length() + 1) {
			if (s.charAt(i) == toSearch.charAt(0)) {
				if (s.substring(i, i + toSearch.length()).equals(toSearch)) {
					System.out.println("pattern found at " + i + " th index");
					count++;
				}
			}
			i++;
		}
		return count;
	}

	public static void main(String[] args) {

		final String UME = "raveernaravindraravindraraveernaraveerna";
		String forLife = "rav";
		System.out.println(search(UME, forLife));

	}
}
