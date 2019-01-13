package com.ravi.leetcode.amazon.explore.others;

/**
 * function that takes an unsigned integer and return the number of '1' bits
 **/
public class NoOf1Bits {

	public int hammingWeight(int n) {
		int num = 0;
		for (int i = 0; i < 32; i++) {
			//use n & 0x80000000 (contains all 0's except left most bit)(hexadecimal representation of -2147483648) 
			//to decide whether n has 1 at its leftmost bit
			if((n & 0x80000000) !=0 ) num++;
			// shift n left by 1 bit 
			n= n << 1;
		}
		return num;
	}
}
