package com.ravi.leetcode;

public class ToLowerCase {

public static String toLowerCase(String str) {
        
	StringBuilder sb = new StringBuilder();
	
	for(int i=0;i<str.length();i++){
		
	sb.append(str.charAt(i) - 32);
	}
	
	
    return sb.toString();    
    }
public static void main(String[] args) {
	
	System.out.println(toLowerCase("RAVI"));
}
}
