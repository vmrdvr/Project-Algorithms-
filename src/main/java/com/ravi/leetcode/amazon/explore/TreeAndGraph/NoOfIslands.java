package com.ravi.leetcode.amazon.explore.TreeAndGraph;
//Depricated
public class NoOfIslands {
	public static int numIslands(char[][] grid) {
		if (grid.length == 0)
			return 0;
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		int number = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				if (grid[i][j] == '1' && (!visited[i][j])) {
					number++;
					// depth first search starts
					helper(i, j, grid, visited);
				}
			}
		}
		return number;
	}

	static void helper(int row, int column, char[][] grid, boolean[][] visited) {
		if(visited[row][column])return;
		visited[row][column]=true;
		
		if (row < 0 || column < 0)
			return;
		for (int i = row;; i++) {
			for (int j = column;; j++) {
				helper(i, j, grid, visited);
			}
		}
	}
}
