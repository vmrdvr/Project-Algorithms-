package com.ravi.leetcode.amazon.explore;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTarget {

	public int[] twoSum(int[] nums, int target) {
		int l = nums.length;
		int[] a = new int[2];
		if (l == 0)
			return a;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < l; i++) {
			if (map.get(target - nums[i]) != null) {

				a[0] = map.get(target - nums[i]);
				a[i] = i;
				return a;
			}
			map.put(nums[i], i);
		}

		/*
		 * for (int i = 0; i < l; i++) { for (int j = i + 1; j < l; j++) { if
		 * (nums[i] + nums[j] == target) { a[0] = i; a[1] = j; return a; } }
		 * 
		 * }
		 */
		return a;

	}

}
