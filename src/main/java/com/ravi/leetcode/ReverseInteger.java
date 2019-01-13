package com.ravi.leetcode;

public class ReverseInteger {

    public int reverse(int x) {
    	
    	if(x==0)return 0;
    	if(x != (int)x) return 0;
    	long reversed = 0;
 
    	while(x!=0){
    		
    		reversed = reversed *10 + x%10;
    		
    		x = x/10;
    	   		 		
    	}
    	if(reversed != (int)reversed) return 0;
    	
		return (int)reversed;
  
    	
    	
    }
    
    public static void main(String[] args) {
		int i = new ReverseInteger().reverse(153423646);
		
		System.out.println(i);
	}
}
