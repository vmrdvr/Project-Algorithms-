package com.amazon;

public class Test2 {
	
	 // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int generalizedGCD(int num, int[] arr)
    {
    	int gcd = arr[0];
    	for(int i=1;i<num;i++) {
    		gcd = gcd(gcd, arr[i]);
    	}
    	return gcd;
    	
    }
    
   
    
    private int gcd(int n1,int n2) {
    	int s = n1>n2?n2:n1;
    	int p = n1>n2?n1:n2;
    	while(s > 0) {
    		p=p%s;
    		p=p+s;
    		s=p-s;
    		p=p-s;
    	}
    	return p;
    }
    // METHOD SIGNATURE ENDS

}
