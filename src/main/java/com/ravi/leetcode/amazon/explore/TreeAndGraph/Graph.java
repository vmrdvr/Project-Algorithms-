package com.ravi.leetcode.amazon.explore.TreeAndGraph;

import java.util.Iterator;
import java.util.LinkedList;
//This class represents a directed graph using adjacency list 
//representation
public class Graph {
	private int size;// No. of vertices 
     // Array  of lists for Adjacency List Representation 
	private LinkedList<Integer> adj[];

	Graph(int size) {
		adj = new LinkedList[size];
		this.size = size;
		for (int i = 0; i < size; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void dfs(int v) {
		boolean[] visited = new boolean[size];
		helper(v, visited);
	}

	void helper(int v, boolean[] visited) {
		visited[v] = true;
		Iterator<Integer> itr = adj[v].listIterator();
		while (itr.hasNext()) {
			int i = itr.next();
			if (!visited[i])
				helper(i, visited);
		}
	}

	void add(int v, int w) {
		adj[v].add(w);
	}

	public static void main(String[] args) {

		Graph g = new Graph(4);
		g.add(2, 0);
		g.add(0, 3);
		g.add(2, 1);
		g.add(1, 7);
		g.dfs(2);

	}

}
