package com.walmart;

import java.util.Scanner;

public class Walmart1 {

	static void brackets(int openStock, int closeStock, String s) {
        if (openStock == 0 && closeStock == 0) {
        	
            System.out.print(s);
        }
        if (openStock > 0) {
            brackets(openStock-1, closeStock+1, s + "(");
        }
        if (closeStock > 0) {
            brackets(openStock, closeStock-1, s + ")");
        }
    }
    public static void main(String[] args) {
        
        
        Scanner s= new Scanner(System.in);
        
        int n = s.nextInt();
        
        brackets(n, 0, " ");
    }
	
}
