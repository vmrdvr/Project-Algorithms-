package com.ravi.hackerearth;

import java.util.Scanner;

public class LittleShino {

	public static void main(String args[] ) {
   

        //Scanner
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int count =0;
        for(int i=1;i<=n1/2;i++){
        	
        	if(n1%i ==0 && n2%i ==0)count++;
        	
        	
        }

        System.out.println(count);

        // Write your code here
System.out.println(0);
if(n2 == 0) System.out.println(0);
    }
	
	
}
