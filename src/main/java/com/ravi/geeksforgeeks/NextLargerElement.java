package com.ravi.geeksforgeeks;
import java.util.ArrayList;
import java.util.List;

public class NextLargerElement {

	static List<Integer> nextLargerElements(int[]a){
		int len=a.length;
		List<Integer> toRuetun= new ArrayList<Integer>();
		if(len==0)return toRuetun;
		if(len==1){
			toRuetun.add(-1);
			return toRuetun ;
		}
		for(int i=0;i<len;i++){
			
			for(int j=i+1;j<len;j++){
				if(a[j]>a[i]){
					toRuetun.add(a[j]);
					break;
				}
					if(j==len-1)
						toRuetun.add(-1);
				}
				
			}
		toRuetun.add(-1);
		return toRuetun;	
		}
		public static void main(String[] args) {
			
			int[] a = { 10, 1, 4, 98, 34, 12, 43 };
			System.out.println(nextLargerElements(a));
		}
		
	}

