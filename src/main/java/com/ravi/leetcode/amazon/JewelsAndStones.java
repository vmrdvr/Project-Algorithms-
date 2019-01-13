package com.ravi.leetcode.amazon;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	public static int numJewelsInStones(String J, String S) {

		Set<Character> Jset = new HashSet<Character>();

		for (char j : J.toCharArray()) {

			Jset.add(j);
		}
		int count = 0;
		for (char s : S.toCharArray()) {

			if (Jset.contains(s)) {
				count++;
			}

		}

		return count;

	}

	public static void main(String[] args) {

		System.out.println(numJewelsInStones("aA", "aAAabbbb"));

	}
}
