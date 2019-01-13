package com.ravi.leetcode;

class OneBitTwoBits {
	public boolean isOneBitCharacter(int[] bits) {	
		int len = bits.length;

		int i =0;
		while(i<len-1){
			i=i+bits[i]+1;
		}
		return i==len-1;
	}
}