package com.ravi.leetcode.amazon.explore.others;

public class MissingNumber {
	// this flag is used for handling stupid test cases like [0, 1] with expected output 2
	public static  int missingNumber(int[] nums) {
		int len = nums.length;
		
		int actualSum =0;
		boolean foundExtra =false;
		int totalSum =0;		
		for(int i=0;i<len;i++){
			if(nums[i]<len)
				actualSum+=nums[i];
			else
				foundExtra=true;
			
			totalSum+=i;
		}
		if(foundExtra)
			return totalSum-actualSum;
		else
			return nums.length;
		
		
    }
	public static void main(String[] args) {
		int[] a ={0,3,1};
		System.out.println(missingNumber(a));
	}
}
