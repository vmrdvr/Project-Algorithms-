package com.ab.algorithms;
//We can do matrix multiplication of (2x3,3x2) or (3x3 ,3x3) or (2x3,3x5) or any combinations of matrix multiplications possible

/*
 * We can also do it using recursion and Strassens multiplication on top of recursion
 * But the time complexities are same O(n^3). 
 * Strassen improved it with some set of formulae to O(n^2.81)- reducing the recursive calls by 7 from 8.
 * then it became O(n^log7))
 * 
 */
public class MatrixMultiplication {

	static int[][] matrixmul(int[][] a, int[][] b) {
		if (a[0].length != b.length) {
			System.out.println("Matrix multiplication not possible");
		}
		int[][] c = new int[a.length][b[0].length];
		if (a[0].length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					for (int k = 0; k < b.length; k++) {
						c[i][j] = c[i][j] + a[i][k] * b[k][j];
					}
				}
			}
		}
		return c;
	}
	public static void main(String[] args) {

		int[][] a = { { 1, 2, 2 }, { 3, 4, 4 } };
		int[][] b = { { 2, 3, 3, 2 }, { 4, 5, 3, 4 }, { 3, 2, 3, 4 } };
		System.out.println(a[0].length);
		matrixmul(a, b);

	}
}
