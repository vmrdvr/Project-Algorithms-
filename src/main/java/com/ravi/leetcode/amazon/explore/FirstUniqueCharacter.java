package com.ravi.leetcode.amazon.explore;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	static int find(String s){
		
		if(s.length() ==1) return 1;
		if(s.length()==1)return -1;
		
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++){
			
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			
			//System.out.println(s.charAt(i)+ "  " + map.getOrDefault(s.charAt(i), 0) );
		}

		
		for(int i=0;i<s.length();i++){
			if(map.get(s.charAt(i))==1){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String s = "raveernaravindra";
		System.out.println(find(s));
		
	}
}
