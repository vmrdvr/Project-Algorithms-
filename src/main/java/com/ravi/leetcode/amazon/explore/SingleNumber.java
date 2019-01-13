package com.ravi.leetcode.amazon.explore;

import java.util.HashSet;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		int l = nums.length;
		if (l == 0)
			return -1;
		if(l==1)
			return nums[0];
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i : nums){
			
			if(set.contains(i))
				set.remove(i);
			else
				set.add(i);
		}
		for(int i : set){
			return i;
		}

		return -1;
	}
	public static void main(String[] args) {
		int[] a= {1,1,2,4,2,5,4};
		System.out.println(singleNumber(a));
	}
}
