package com.ravi.ds.tree;

class Node{
	int val;
	Node left;
	Node right;
}

class Runner {
	
	public Node createNewNode(int n){
		Node n1 = new Node();
		n1.val=n;
		n1.left=null;
		n1.right=null;
		return n1;
		
	}
	

	 public Node insertNode(Node node, int n) {
		 Node temp =null;
		 if(node == null){
			 
			 return createNewNode(n);
		 }
		 if(node.val>=n){
			 
			 return insertNode(node.left, n);
			 
		 }else if(node.val<n){
			 
			 return insertNode(node.right, n);
		 }
		 
		 
		 return temp;
		
	}
	
	 
}

public class BST{
	
	
	public static void main(String[] args) {
		
		Runner tree = new Runner();
		
		Node root = new Node();

		
		tree.insertNode(root,9);
		
	}


	
}