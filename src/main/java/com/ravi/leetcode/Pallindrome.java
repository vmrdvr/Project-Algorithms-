package com.ravi.leetcode;

public class Pallindrome {
	  public boolean isPalindrome(int x) {
		  int val = x;
		
		  int rev = 0;
		  
		  while(x>0){
			  
			  rev = rev * 10 + x%10;
			  
			  x=x/10;
			  
			  
		  }
		  
		  if(val == rev)return true;
		  
		return false;
	        
	    }
	  
/*	  public static void main(String[] args) {
		System.out.println(new Pallindrome().isPalindrome(0));
	}*/
}
