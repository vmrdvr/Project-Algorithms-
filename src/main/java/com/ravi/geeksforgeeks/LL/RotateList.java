package com.ravi.geeksforgeeks.LL;

public class RotateList {

	Node head;

	void rotateList(Node head,int k) {
		Node tempHead=head;
		int var=k;
		if(head==null) return;
		if(k==0) return;
		Node l2=head;
		while(k>0 && l2.next!=null){
			l2=l2.next;
			k--;
		}
		Node temp = l2;
		head=temp;
		
		Node prev=null;
		//head
		while(temp.next!=null){
			prev=temp;
			temp=temp.next;
		}
		while(var>0){
			temp.next=tempHead;
			temp=temp.next;
			tempHead=tempHead.next;
			var--;
		}
		temp.next=null;
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
	
	}

	public static void main(String[] args) {

		RotateList ll = new RotateList();
		Node n1 = new Node(5);
		ll.head = n1;
		ll.head.next = new Node(4);
		ll.head.next.next = new Node(2);
		ll.head.next.next.next = new Node(1);
		ll.head.next.next.next.next = new Node(9);
		ll.head.next.next.next.next.next = new Node(8);
		ll.rotateList(ll.head,2);
	}

}
