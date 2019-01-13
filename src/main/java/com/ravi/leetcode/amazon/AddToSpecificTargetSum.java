package com.ravi.leetcode.amazon;

import java.util.Arrays;

public class AddToSpecificTargetSum {
	
	 public int[] twoSum(int[] nums, int target) {
	        
		 int[] a = nums;
		 int[] newArrIndices = new int[2];
		 
		 for(int i=0;i<=a.length-2;i++){
			 
			 for(int j=i+1;j<=a.length-1;j++){
				 
				 int sum = a[i]+a[j];
				 
				 if(sum == target){
					 newArrIndices[0]=i;
					 newArrIndices[1]=j;
					 return newArrIndices;
				 }
				 
			 }
			 			 
		 }
 
		 return null;
	    }
public static void main(String[] args) {
	int[] ar = {3,2,4};
	int[] r = new AddToSpecificTargetSum().twoSum(ar, 6);
	System.out.println(Arrays.toString(r));
}
}
