package com.ravi.leetcode.amazon;
//DFS Approach to traverse Islands
public class NumberOfIslands {

	public static int numIslands(char[][] grid) {

		if (grid.length == 0)
			return 0;
		int rowl = grid.length;

		// boolean[][] visited= new boolean[grid.length][grid[0].length];
		int total = 0;
		for (int i = 0; i < rowl; i++) {
			int columnl = grid[0].length;
			for (int j = 0; j < columnl; j++) {

				if (grid[i][j] == '1') {
					traverse(i, j, grid);
					total++;
				}
			}
		}
		return total;
	}

	static void traverse(int i, int j, char[][] grid) {

		if (i >= 0 && i < grid.length && j >= 0 && j < grid.length && grid[i][j] == '1') {
			grid[i][j] = 'v';
			traverse(i, j - 1, grid);
			//traverse(i - 1, j - 1, grid);
			traverse(i - 1, j, grid);
			//traverse(i - 1, j + 1, grid);
			traverse(i, j + 1, grid);
			//traverse(i + 1, j + 1, grid);
			traverse(i + 1, j, grid);
			//traverse(i + 1, j - 1, grid);
		}

	}

	public static void main(String[] args) {
		char [][] a=  {{'1', '1', '0', '0', '0'},
		               {'1', '1', '0', '0', '0'},
		               {'0','0', '1', '0', '0'},
		               {'0', '0', '0', '0', '0'},
		               {'1','0','0','1','1'}};
		
		System.out.println(numIslands(a));
	}

}
