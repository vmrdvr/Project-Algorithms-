package com.ravi.leetcode.amazon.explore;

import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new LinkedList<>();
		combinationSumHelper(0, candidates, new LinkedList<Integer>(), target, list);
		return list;
	}

	public static void combinationSumHelper(int start, int[] nums, LinkedList<Integer> soFar, int target,List<List<Integer>> resultSet) {
		if (target == 0)
			resultSet.add(new LinkedList(soFar));

		for (int i = start; i < nums.length; i++) {
			if (target - nums[i] >= 0) {
				soFar.add(nums[i]);
				combinationSumHelper(i, nums, soFar, target - nums[i], resultSet);
				soFar.removeLast();
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 5 };
		System.out.println(combinationSum(a, 8));
	}
}
