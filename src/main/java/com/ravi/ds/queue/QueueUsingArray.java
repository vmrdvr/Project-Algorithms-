package com.ravi.ds.queue;

import java.util.Arrays;

public class QueueUsingArray {
	final int MAX = 10;
	int[] a = new int[MAX];
	int top;
	int len = a.length-1;
	public QueueUsingArray() {
	}
	public static void main(String[] args) {

		QueueUsingArray q = new QueueUsingArray();
		q.push(5);
		q.push(2);
		q.push(8);
		q.push(9);
		System.out.println("Before Array : "+Arrays.toString(q.a));
		System.out.println("polling " + q.poll() + " from Queue");
		System.out.println("polling " + q.poll() + " from Queue");
		System.out.println("polling " + q.poll() + " from Queue");
		q.push(2);
		q.push(8);
		System.out.println("polling " + q.poll() + " from Queue");
		System.out.println("After array "+Arrays.toString(q.a));
	}

	void push(int n) {

		if (a.length > 0) {
			System.out.println("pushing " + n + " to Queue");
				
			do{
				a[len] = n;
			}while(len>len-1);{
								
				a[len-1]=a[len];
			}
			
			len--;
		}

	}

	int poll() {
		int b = 0;
		if (a.length > 0) {
			b = a[0];
			for(int i=1;i<a.length;i++){
				a[i-1]=a[i];
				
			}
			a[a.length-1]=0;
		}
		return b;
	}
}
