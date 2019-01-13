package com.ravi.geeksforgeeks.Tree;

import java.util.Queue;

public class TreeTraversels {
	Node root;

	static void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.val + " ");
		inOrder(root.right);

	}

	static void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.val + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	static void postOrder(Node root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val + " ");
	}

	// BFS
	static void levelOrder(Node root) {
		if (root == null)
			return;
		int h = heightOfTree(root);
		System.out.println("Level Order Traversal of the tree : " +h );
		for (int i = 0; i <= h; i++) {
			levelOrderWrapper(root, i);
		}
	}

	static void levelOrderWrapper(Node root, int i) {

		if (root == null)
			return;
		if (i == 1) {
			System.out.print(" " + root.val);
		} else if (i > 1) {
			levelOrderWrapper(root.left, i - 1);
			levelOrderWrapper(root.right, i - 1);
		}

	}

	static int sum = 0;

	static void sumOfLeaves(Node root) {
		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			sum = sum + root.val;

		}

		sumOfLeaves(root.left);
		sumOfLeaves(root.right);

		
	}

	static int heightOfTree(Node root) {

		if (root == null)
			return 0;
		else {
			int lheight = heightOfTree(root.left);

			int rheight = heightOfTree(root.right);

			if (lheight > rheight) {
				return lheight + 1;
			} else {
				return rheight + 1;
			}
		}
	}

	static void traversels(Node root) {
		System.out.print("In -Order Traversal For the tree : ");
		//inOrder(root);
		System.out.println();
		System.out.print("Pre- Order Traversal of the tree : ");
		//preOrder(root);
		System.out.println();
		System.out.print("Post Order Travesal of the tree : ");
		//postOrder(root);
		System.out.println();
		levelOrder(root);

	}

	public static void main(String[] args) {

		TreeTraversels tree = new TreeTraversels();
		Node n1 = new Node(9);
		tree.root = n1;
		tree.root.left = new Node(4);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(21);
		tree.root.left.right = new Node(31);
		tree.root.right.left = new Node(12);
		tree.root.right.right = new Node(10);
		traversels(tree.root);
		sumOfLeaves(tree.root);
		System.out.println(sum);
	}

}

class Node {

	int val;
	Node left;
	Node right;

	Node(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}