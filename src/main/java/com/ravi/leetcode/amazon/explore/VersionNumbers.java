package com.ravi.leetcode.amazon.explore;

public class VersionNumbers {
//
	public int compareVersion(String version1, String version2) {

		String[] s = version1.split("\\.");
		String[] s2 = version2.split("\\.");

		int len = s.length > s2.length ? s.length : s2.length;

		for (int i = 0; i < len; i++) {

			Integer v1 = i < s.length ? Integer.valueOf(s[i]) : 0;
			Integer v2 = i < s2.length ? Integer.valueOf(s2[i]) : 0;
			int comp = v1.compareTo(v2);
			if (comp != 0) {
				return comp;
			}

		}
		return 0;
	}

	public static void main(String[] args) {
		String s1 = "1.01.01";
		String s2 = "1.1020";
		VersionNumbers v = new VersionNumbers();
		System.out.println(v.compareVersion(s1, s2));
	}
}
