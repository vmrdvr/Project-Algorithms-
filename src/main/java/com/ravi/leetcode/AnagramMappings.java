package com.ravi.leetcode;

import java.util.HashSet;
import java.util.Set;

public class AnagramMappings {

	public int[] anagramMappings(int[] A, int[] B) {
		if (A.length != B.length)
			return new int[0];

		int[] out = new int[A.length];
		int k = 0;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]) {
					if (set.contains(j)) {
						continue;
					}
					set.add(j);
					out[k++] = j;
					break;
				}
			}
		}

		return out;
	}
}
