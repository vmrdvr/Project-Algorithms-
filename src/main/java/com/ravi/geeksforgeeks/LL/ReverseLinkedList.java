package com.ravi.geeksforgeeks.LL;

public class ReverseLinkedList {

	Node head;

	void reverseList(Node head) {

		if (head == null)
			return;
		Node prev = null;
		while (head.next != null) {
			Node temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}
		head.next = prev;

		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		ReverseLinkedList ll = new ReverseLinkedList();
		Node n1 = new Node(5);
		ll.head = n1;
		ll.head.next = new Node(4);
		ll.head.next.next = new Node(2);
		ll.head.next.next.next = new Node(1);
		ll.head.next.next.next.next = new Node(9);
		ll.head.next.next.next.next.next = new Node(8);
		ll.reverseList(ll.head);
	}

}

