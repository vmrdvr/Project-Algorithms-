package com.walmart;

import java.util.Scanner;

public class Walmart_Test1 {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);

		int T = s.nextInt();
		
		int[] a = new int[T];
		
		while (T !=0) {
			int n = s.nextInt();
			for (int i = 1; i <= n; i++) {
			Walmart_Test1.print(i);
			}
			T--;
		}
	}

	static void print(int n) {
	
		if(n%3==0 && n%5 ==0){
			System.out.println("FizzBuzz");
		}else if(n%3 == 0){
			System.out.println("Fizz");
		}else if(n%5 == 0){
			System.out.println("Buzz");
		}else if(n%3 != 0 && n%3!=0){
			System.out.println(n);
		}
		
	
		
	}

}
