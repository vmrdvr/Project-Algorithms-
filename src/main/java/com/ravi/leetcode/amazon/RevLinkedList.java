package com.ravi.leetcode.amazon;

public class RevLinkedList {
	Node head;

	static class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	static Node createReverseList(Node head, Node prev, Node next) {

		if (head == null)
			return prev;
		next = head.next;
		head.next = prev;
		prev = head;
		head = next;
		return createReverseList(head, prev, next);
	}

	public static Node reverseListRecursively(Node head) {
		Node prev = null;
		Node next = null;
		head =createReverseList(head, prev, next);
		
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;

		}
		return head;
	}

	public static Node reverseList(Node head) {
		Node prev = null;
		Node next = null;

		while (head != null) {

			next = head.next;
			head.next = prev;
			prev = head;
			head = next;

		}
		head = prev;
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;

		}
		return head;
	}

	public static void printList(Node head) {

		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;

		}

	}

	public static void main(String[] args) {

		RevLinkedList ll = new RevLinkedList();
		ll.head = new Node(5);
		Node n2 = new Node(3);
		Node n3 = new Node(2);
		Node n4 = new Node(84);
		Node n5 = new Node(21);
		Node n6 = new Node(10);
		ll.head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = null;

		printList(ll.head);
/*		System.out.println();
		System.out.println("After Reversing");
		reverseList(ll.head);*/
		System.out.println();
		System.out.println("After Reversing Recursively");
		reverseListRecursively(ll.head);

	}
}
