package com.ravi.hackerrank;
import java.util.*;
import java.io.*;
// (a+2^0 b),(a+2^0 b+2^1.b), (a+2^0 b+2^1.b+2^2.b)
class SeriesOfN{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j = 0;j<n;j++){
            	
            	
            	System.out.print( getValue(a, b, j) + " " );
            }
            System.out.println();
        }
        in.close();
    }

	private static int getValue(int a, int b, int j) {
		
		int sum =a;
		
		for(int f=0;f<=j;f++){
		sum = sum  + pow(f) * b;
		}
		return sum;
	}

	private static int pow(int j) {
		if(j==0)return 1;
		int pow =1;
		for(int k=0;k<j;k++){
		pow = pow * 2;
		}
		return pow;
	}
}