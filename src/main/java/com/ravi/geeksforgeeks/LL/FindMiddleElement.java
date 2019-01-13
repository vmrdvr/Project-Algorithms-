package com.ravi.geeksforgeeks.LL;

public class FindMiddleElement {

	Node head;

	int getMiddle(Node head) {
		Node temp = head;
		if (head == null)
			return -1;
		int len = 0;
		while (head != null) {
			len++;
			head = head.next;
		}
		int flag = 0;
		if (len % 2 != 0) {

			while (temp != null && flag < len / 2) {
				temp = temp.next;
				flag++;
			}

		} else {
			while (temp != null && flag < len / 2) {
				temp = temp.next;
				flag++;
			}
		}
		return temp.data;
	}

	public static void main(String[] args) {

		FindMiddleElement ll = new FindMiddleElement();
		Node n1 = new Node(5);
		ll.head = n1;
		ll.head.next = new Node(4);
		ll.head.next.next = new Node(2);
		ll.head.next.next.next = new Node(1);
		ll.head.next.next.next.next = new Node(9);
		ll.head.next.next.next.next.next = new Node(8);

		System.out.println(ll.getMiddle(ll.head));
	}
}

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}
