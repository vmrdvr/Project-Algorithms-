package com.ravi.geeksforgeeks;

public class TwoTreesComparision {
	Node root;
	class Node {
		Node left;
		Node right;
		int val;

		public Node(int val) {
			this.val = val;
		}
	}

	boolean isIdentical(Node node1, Node node2) {
		if (node1 == null && node2 == null)
			return true;
		if ((node1 == null && node2 != null) || (node2 == null && node1 != null) || (node1.val != node2.val))
			return false;
		return isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right);
	}

}
