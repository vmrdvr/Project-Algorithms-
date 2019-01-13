package com.ravi.ds.stack;

import com.amazon.onsite.ds.LinkedList;
import com.amazon.onsite.ds.Node;

public class StackUsingLinkedList {

	Node n1 = new Node(5);
	LinkedList ll = new LinkedList(n1);

	public StackUsingLinkedList() {

	}

	void push(int n) {

		ll.append(n1);

	}

	public static void main(String[] args) {

		System.out.println();

		StackUsingLinkedList sl = new StackUsingLinkedList();

		sl.push(5);

	}
}
