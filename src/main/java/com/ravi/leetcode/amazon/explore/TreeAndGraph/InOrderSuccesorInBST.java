package com.ravi.leetcode.amazon.explore.TreeAndGraph;

public class InOrderSuccesorInBST {
	TreeNode root;

	public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

		if (root == null)
			return null;
		

		if(root.val<p.val){
			return inorderSuccessor(root.right, p);
		}else{
			TreeNode left = inorderSuccessor(root.left, p);
			
			return left!=null?left:root;
		}
	}
	//InorderPredecor
	public TreeNode predecessor(TreeNode root, TreeNode p) {
		  if (root == null)
		    return null;

		  if (root.val >= p.val) {
		    return predecessor(root.left, p);
		  } else {
		    TreeNode right = predecessor(root.right, p);
		    return (right != null) ? right : root;
		  }
		}

	/*private static TreeNode inOrderSuccessorFinder(TreeNode root, TreeNode p, TreeNode next) {

		if (root != null) {
			next = root;
			inOrderSuccessorFinder(root.left, p,next );
			if(root.val==p.val) return next;
		
			inOrderSuccessorFinder(root.right, p,next);

		}

		return null;
	}*/

	public static void main(String[] args) {
		InOrderSuccesorInBST tree = new InOrderSuccesorInBST();
		TreeNode n1 = new TreeNode(9);
		tree.root = n1;
		tree.root.left = new TreeNode(4);
		tree.root.right = new TreeNode(2);
		tree.root.left.left = new TreeNode(21);
		tree.root.left.right = new TreeNode(31);
		tree.root.right.left = new TreeNode(12);
		tree.root.right.right = new TreeNode(10);
		inorderSuccessor(tree.root,tree.root);
	}

}
