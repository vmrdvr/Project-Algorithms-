package com.ravi.geeksforgeeks.amzn;

import java.util.PriorityQueue;
import java.util.Stack;

public class KLargestElements {

	static void find(int[] a,int k){
		
		PriorityQueue<Integer> p = new PriorityQueue<>();
		
		for(int i=0;i<a.length;i++){
			p.offer(a[i]);
			
			if(p.size()>k){
				p.poll();
			}
	
		}
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i=0;i<k;i++){
		
			s.push(p.poll());
		}
		int j=0;
		while(j<k-1){
		s.pop();
		j++;
		}
	}
	
	public static void main(String[] args) {
		int[] a = { 2, 3, 5 , 2,49,34,21,32,1,23};
		find(a, 6);
	}
}
