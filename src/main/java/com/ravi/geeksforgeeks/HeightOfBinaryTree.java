package com.ravi.geeksforgeeks;

public class HeightOfBinaryTree {
	Node root;

	class Node {
		Node left;
		Node right;
		int val;

		public Node(int val) {
			this.val = val;
		}
	}

	int height(Node root) {
		int height = 0;
		if (root == null)
			return height;
		while (root != null) {
			height++;
			root = root.left;
		}
		return height;
	}
}
