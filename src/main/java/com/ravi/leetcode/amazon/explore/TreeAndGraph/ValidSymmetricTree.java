package com.ravi.leetcode.amazon.explore.TreeAndGraph;

import java.util.ArrayList;
import java.util.List;

public class ValidSymmetricTree {
	Node root;
	/** Recursive Solution Easy to Understand **/
	public boolean isSymmetric(TreeNode root) {
	    if(root==null) return true;
	    return isMirror(root.left,root.right);
	}
	public boolean isMirror(TreeNode p, TreeNode q) {
	    if(p==null && q==null) return true;
	    if(p==null || q==null) return false;
	    return (p.val==q.val) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
	}
	/** My Solution using level order traversal with some failed test cases. **/  
	static boolean isValid(Node root){

		if(root==null)return false;
		List<List<Integer>> toCheck = new ArrayList<>();
		toCheck=levelOrder(root);
		for(int i=1;i<toCheck.size();i++){
			for(int j=0;j<toCheck.get(i).size();j++){
				int last = toCheck.get(i).size()-1;
				if(toCheck.get(i).get(j)==toCheck.get(i).get(last-j)){
					continue;
				}else{
					return false;
				}
			}
		}
		return true;
	}
	
	static List<List<Integer>> levelOrder(Node root) {

		// int h = height(root);
		List<List<Integer>> list = new ArrayList<>();
		levelOrderHelper(root, list, 0);
		return list;
		// for (int i = 0; i <= h; i++) {
		// levelOrderHelper(root, i);
		// }
	}

	static void levelOrderHelper(Node root, List<List<Integer>> list, int level) {

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
	public static void main(String[] args) {

		ValidSymmetricTree tree = new ValidSymmetricTree();
		Node n1 = new Node(1);
		tree.root = n1;
		tree.root.left = new Node(2);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(31);
		tree.root.right.left = new Node(31);
		tree.root.right.right = new Node(3);
		tree.root.right.right.right = new Node(38);
		System.out.println(isValid(tree.root));
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