package com.ravi.leetcode.amazon.explore.others;
// Hamming distance between two integers is the number of positions at which the corresponding bits are different
public class HammingDistance {

public static int hammingDistance(int x, int y) {
        
	int num=0;
	long  one = x ^ y;

	while(one >0){
		if((one & 1) !=0 )
		num++;
		one = one >> 1;
	}
	
	return num;
    }
public static void main(String[] args) {
	System.out.println(hammingDistance(1, 4));
}
}
