package com.ravi.leetcode;

public class AddTwoNumsToString {

    public static String addStrings(String num1, String num2) {
        
    	int i = num1.length() -1;
    	int j = num2.length() -1;
    	StringBuffer sb = new StringBuffer();
    	int carry = 0;
    	while (i >= 0 || j >= 0 || carry == 1){
    	int sum = carry;
    	if(i >= 0) sum += num1.charAt(i) - '0';
    	
    	if(j >= 0) sum += num2.charAt(j) - '0';
    	i--;j--;
    	sb.append(sum % 10);
    	
    	carry = sum / 10;
    	}
    	return sb.reverse().toString();
    }
    public static void main(String[] args) {
    	int s = '2' - '0';
    	
		System.out.println(addStrings("429", "21"));
	}
}
