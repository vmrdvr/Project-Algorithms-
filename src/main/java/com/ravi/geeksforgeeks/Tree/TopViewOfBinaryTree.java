package com.ravi.geeksforgeeks.Tree;
//Need to modify solution
public class TopViewOfBinaryTree {
	
	Node root;
	
	static void topView(Node root){
		
		if(root==null)return;
		
		leftView(root);
		int i=1;
		rightView(root,i);
	}
	static void leftView(Node root){
		if(root==null)return;
		leftView(root.left);
		System.out.print(root.val+ " ");
		
	}
	static void rightView(Node root,int i){
		if(root==null)return;
		
		if(i!=1){
			System.out.print(root.val+" ");	
		}
		i++;
		rightView(root.right,i);
	}
	public static void main(String[] args) {

		TopViewOfBinaryTree tree = new TopViewOfBinaryTree();
		Node n1 = new Node(9);
		tree.root = n1;
		tree.root.left = new Node(4);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(21);
		tree.root.left.right = new Node(31);
		tree.root.right.left = new Node(12);
		tree.root.right.right = new Node(10);
		topView(tree.root);
	}

}


