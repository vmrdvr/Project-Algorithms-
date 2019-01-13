package com.ravi.leetcode;

import java.util.Scanner;

public class RomanToInteger {

	 int switchfn(String c){
		 if(c.equals("I")) return 1;
		 if(c.equals("V"))return 5;
		 if(c.equals("X"))return 10;
		 if(c.equals("L"))return 50;
		 if(c.equals("C"))return 100;
		 if(c.equals("D"))return 500;
		 if(c.equals("M"))return 1000;
		 return -1;
	 }
	 public int romanToInt(String s) {
		 String[] strArr = new String[s.length()];
		 int sum =0;
		for(int f=0;f<s.length();f++){
			
			strArr[f]=s.substring(f, f+1);
		}
		
		for(int j=0;j<s.length();j++){
			
			int s1 = switchfn(strArr[j]);
			
			if(j+1 < s.length()){
				
				int s2 = switchfn(strArr[j+1]);
				
				if(s1>=s2){
					
					sum+=s1;
					
				}else{
					sum+=s2-s1;
					j++;
				}
			}else{
				sum+=s1;
				j++;
			}
		}
		 return sum;
	
	    }
	public static void main(String[] args) {
		int i=0;
	while(true){
			Scanner sc= new Scanner(System.in);
	
			System.out.println(new RomanToInteger().romanToInt(sc.nextLine()));
			
		}

	}
}
