package com.ravi.ds.tree;

public class BinarySearchTree {
	Node root;

	public BinarySearchTree() {
		root = null;
	}
	class Node {
		Node left;
		Node right;
		int val;
		Node(int val) {
			this.val = val;
		}
	}

	public Node createNewNode(Node root, int val) {
		if (root == null) {
			root = new Node(val);
			return root;
		}
		if (val > root.val) {
			root.right = createNewNode(root.right, val);

		} else if (val < root.val) {
			root.left = createNewNode(root.left, val);
		}
		return root;
	}

	// inserts a node to BST
	private void insert(int val) {

		root = createNewNode(root, val);
	}

	// delete a node from BST
	private void delete(int val) {

		root = deleteNode(root, val);
	}

	private Node deleteNode(Node root, int val) {

		if (root == null)
			return root;
		if (val > root.val) {
			root.right = deleteNode(root.right, val);

		} else if (val < root.val) {

			root.left = deleteNode(root.left, val);
		}
		// root equals to the value to be deleted
		else {
			if (root.left == null)
				return root.right;
			if (root.right == null)
				return root.left;

			// if root has two childs
			root.val = minValueFromRight(root.right);

			root.right = deleteNode(root.right, root.val);

		}
		return root;
	}

	int minValueFromRight(Node right) {
		int minVal = right.val;
		while (right.left != null) {
			minVal = right.left.val;
			right = right.left;

		}
		return minVal;
	}

	void printNodes(Node root) {
		if (root != null) {
			printNodes(root.left);
			System.out.print(root.val + "->");
			printNodes(root.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(5);
		bst.insert(85);
		bst.insert(32);
		bst.insert(1);
		bst.insert(14);
		bst.insert(35);
		bst.insert(7);
		// bst.delete(35);
		// bst.delete(1);
		// bst.delete(32);
		bst.printNodes(bst.root);
		System.out.println();
		System.out.println(bst.minValueFromRight(bst.root));
	}
}
