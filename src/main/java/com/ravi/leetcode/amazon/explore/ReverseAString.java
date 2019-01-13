package com.ravi.leetcode.amazon.explore;

public class ReverseAString {

public static String reverseString(String s) {
     
		if(s.length()==0 || s.length()==1) return s;
		StringBuilder str = new StringBuilder();
		for(int i=s.length()-1;i>=0;i--){
			
			str=str.append(s.charAt(i));
		}
	return str.toString();
    }
public static void main(String[] args) {
	String s = "raveernaravindra";
	System.out.println(reverseString(s));
	
}
}
