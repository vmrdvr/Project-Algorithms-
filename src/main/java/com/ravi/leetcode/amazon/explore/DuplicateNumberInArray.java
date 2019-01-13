package com.ravi.leetcode.amazon.explore;

import java.util.Arrays;

public class DuplicateNumberInArray {

	 public int findDuplicate(int[] nums) {
	       int len =nums.length;
		 if(len==0)return -1;
		 Arrays.sort(nums);
		 int i=1;
		 while(i<len){
			 if(nums[i-1]==nums[i])
				 return nums[i];
			 i++;
		 }
		 return 0;
	    }
	
	
}
