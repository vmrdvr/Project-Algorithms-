package com.ravi.leetcode.amazon.explore;

import java.util.Arrays;

public class KthLargestElement {
	
	public static int findKthLargest(int[] nums, int k) {
		int len=nums.length;
		if(len==0|| k==0)return -1;
		if(len==1 && k==1)return nums[0];
		Arrays.sort(nums);
		return nums[len-k];
		
	}
public static void main(String[] args) {
	int [] a = {3,6};
	System.out.println(findKthLargest(a, 2));

}
}
