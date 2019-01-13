package com.ravi.leetcode.amazon.explore.TreeAndGraph;

import java.util.ArrayList;
import java.util.List;

//Level order traversal without finding height;
public class LevelOrderTravelBT {

	TreeNode root;

	static void levelOrder(TreeNode root) {

		// int h = height(root);
		List<List<Integer>> list = new ArrayList<>();
		levelOrderHelper(root, list, 0);
		// for (int i = 0; i <= h; i++) {
		// levelOrderHelper(root, i);
		// }
	}

	static void levelOrderHelper(TreeNode root, List<List<Integer>> list, int level) {

		if (root == null) {
			return;
		}
		if (list.size() == level) {
			list.add(new ArrayList<Integer>());
		}
		list.get(level).add(root.val);
		levelOrderHelper(root.left, list, level + 1);
		levelOrderHelper(root.right, list, level + 1);

	}

	// Not required if you want to return a List of List of the elements.
	static int height(TreeNode root) {

		if (root == null)
			return 0;
		else {
			int lheight = height(root.left);

			int rheight = height(root.right);

			if (lheight > rheight) {
				return lheight + 1;
			} else {
				return rheight + 1;
			}
		}
	}

	public static void main(String[] args) {
		LevelOrderTravelBT tree = new LevelOrderTravelBT();
		TreeNode n1 = new TreeNode(9);
		tree.root = n1;
		tree.root.left = new TreeNode(4);
		tree.root.right = new TreeNode(2);
		tree.root.left.left = new TreeNode(21);
		tree.root.left.right = new TreeNode(31);
		tree.root.right.left = new TreeNode(12);
		tree.root.right.right = new TreeNode(10);
		tree.root.right.right.left = new TreeNode(56);

		levelOrder(tree.root);
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
