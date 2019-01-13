package com.ravi.leetcode.amazon.explore.TreeAndGraph;

public class IsValidBST {
	//Recursion Simple Solution
		public boolean isValidBST(TreeNode root) {
		    return isValid(root, null, null);
		}
	
		public boolean isValid(TreeNode root, Integer lower, Integer upper) {
		    if(root == null) return true;
		    if(lower != null && root.val <= lower) return false;
		    if(upper != null && root.val >= upper) return false;
		    
		    return isValid(root.left, lower, root.val) && isValid(root.right, root.val, upper);
		}
	//my solution passes 70/75
	public boolean isValidBST2(TreeNode root) {
		TreeNode node = root;
		if (root == null)
			return true;

		return BSThelper(root.left, root.right);
	}

	boolean BSThelper(TreeNode leftTree, TreeNode rightTree) {

		if (leftTree == null && rightTree == null)
			return true;
		
		if (leftTree.left != null) {
			if (leftTree.left.val >= leftTree.val)
				return false;
		}
		if (rightTree.right != null) {
			if (rightTree.right.val <= rightTree.val)
				return false;
		}

		return BSThelper(leftTree.left,leftTree.right) && BSThelper(rightTree.right,rightTree.left);

	}
	

}
