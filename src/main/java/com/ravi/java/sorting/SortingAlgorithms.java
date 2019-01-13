package com.ravi.java.sorting;

import java.util.Arrays;

public class SortingAlgorithms {

	static void bubbleSort(int []arr){
		
		int n =arr.length;
		int temp;
		for(int i=0;i<n-1;i++) {
			
			for(int j=1;j<n;j++){
				
				 if(arr[j-1] > arr[j]){  
                     //swap elements  
                     temp = arr[j-1];  
                     arr[j-1] = arr[j];  
                     arr[j] = temp;  
             }  
				
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		}
	public static void main(String[] args) {
		int [] a = {6,5,3,8,10,6,7,17,88,54,54,5};
		SortingAlgorithms.bubbleSort(a);
	}
}
