package com.ravi.leetcode.amazon.explore.TreeAndGraph;

public class FloodFillAlgorithm {
	
	static int[][] fill(int[][]screen, int x, int y,int prevC,int newC){
		
		if(x<0 || x>=screen.length || y<0 || y>=screen[0].length)return screen;
		if(screen[x][y]!= prevC)return screen;
		
		screen[x][y]=newC;
		fill(screen, x-1, y, prevC, newC);
		fill(screen, x+1, y, prevC, newC);
		fill(screen, x, y-1, prevC, newC);
		fill(screen, x, y+1, prevC, newC);
		return screen;
	}
	
	static int[][] floodFill(int[][] screen, int x,int y,int newC){
		if(x>=0 && x<screen.length && y>=0 && y<screen[0].length){
		int prevC= screen[x][y];
		return fill(screen, x, y, prevC, newC);
		}else{
			return screen;
		}
	}
	public static void main(String[] args) {

		int[][] screen = { { 1, 2, 1, 1, 1, 1, 1, 1 },
						   { 1, 1, 1, 1, 1, 1, 0, 0 }, 
						   { 1, 0, 0, 1, 1, 0, 1, 1 },
						   { 1, 2, 2, 2, 2, 0, 1, 0 },
						   { 1, 1, 1, 2, 2, 0, 1, 0 }, 
						   { 1, 1, 1, 2, 2, 2, 2, 0 },
						   { 1, 1, 1, 1, 1, 2, 1, 1 }, 
						   { 1, 1, 1, 1, 1, 2, 2, 1 }, };
		int x = 3, y = 4, newC = 3;
		floodFill(screen,x,y,newC);
		
		System.out.print("{ ");
		for(int i=0;i<screen.length;i++){
			System.out.print("{ ");
			for(int j=0;j<screen[i].length;j++){
				System.out.print(screen[i][j]+" ,");
			}
			System.out.print(" }");
			System.out.println();
		}
		System.out.print(" }");
	}
}
