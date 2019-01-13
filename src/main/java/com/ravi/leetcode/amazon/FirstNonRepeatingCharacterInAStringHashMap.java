package com.ravi.leetcode.amazon;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterInAStringHashMap {

	static int firstNonRepeatingChar(String s) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);

		}
		for (int j = 0; j < s.length(); j++) {
			if (map.get(s.charAt(j)) == 1) {
				return j;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String s = "raveernaravindra";
		System.out.println(firstNonRepeatingChar(s));
	}
}
