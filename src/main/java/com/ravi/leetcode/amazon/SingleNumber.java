package com.ravi.leetcode.amazon;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public int singleNumber(int[] nums) {
		if(nums.length==0) return 0;
		if(nums.length==1) return nums[0];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		for (int i = 0; i < nums.length; i++) {
			int t = map.get(nums[i]);
			if (t == 1)
				return nums[i];
		}
		return -1;
	}
}
