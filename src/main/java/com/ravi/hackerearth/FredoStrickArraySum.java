package com.ravi.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class FredoStrickArraySum {

	  public static void main(String args[] ) throws Exception {
	 
	        Scanner s = new Scanner(System.in);
	        int size = s.nextInt();
	        
	        int[] a=new int[size];
	        int sum=0;
	        for(int i=0;i<size;i++){
	        	
	        	a[i]=s.nextInt();
	        	
	        	sum+=a[i];
	        	
	        }

	        Arrays.sort(a);
	        a = removeDuplicates(a);
	        
	        for(int j=0;j<a.length;j++){
	        	
	        	
	        	int elemSum = sum(a[j], a.length);
	        	
	        	if(elemSum == sum){
	        		
	        		System.out.println(a[j+1]);
	        	}
	        	
	        }

	        

	    }
	  public static int[] removeDuplicates(int[] A) {
		    if (A.length==0) return A;
		    int j=0;
		    for (int i=0; i<A.length; i++)
		        if (A[i]!=A[j]) A[++j]=A[i];
		    return A;
		}
	
	static int sum(int n,int size){
		int value =0;
		
	value = n * size;
		
		return value;
	}
	
}
