package com.ravi.geeksforgeeks;

public class MergeSort012 {

	static void sort(int[] a){
		int len=a.length;
		if(len==0 ||len==1 ) return;
		 mergeSort(a,0,len-1);
	}
	static void mergeSort(int[] a,int l, int r){
		
		if(l<r){
			int mid = (l+r)/2;
			mergeSort(a, l, mid);
			mergeSort(a, mid+1, r);
			merge(a,l,mid,r);
			}		
		}
		
	static void merge(int[]a, int l,int mid, int r){
		
		
		
		
		
	}
	public static void main(String[] args) {
		
		
	}
}
