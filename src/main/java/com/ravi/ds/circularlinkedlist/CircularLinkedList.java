package com.ravi.ds.circularlinkedlist;

public class CircularLinkedList {
	Node head;

	class Node {
		Node next;
		int data;

		Node(int data) {

			this.data = data;
			
		}
	}

	public static void main(String[] args) {

		CircularLinkedList cl = new CircularLinkedList();

		cl.append(5);
		cl.append(10);
		cl.append(18);
		cl.append(78);
		cl.append(47);
		cl.link(cl.head);
		//cl.push(1);
		cl.link(cl.head);
		cl.printList(cl.head);

	}

	void link(Node head) {
		Node temp =head;
		if(head==null)return;
		Node last =null;
		while(head!=null){
			last =head;
			head =head.next;			
		}
		last.next=temp;
		head=temp;
		return;
	}

	void push(int i) {
	
	}

	void append(int n) {
		Node new_node= new Node(n);
		if (head == null) {
			head = new_node;
			head.next = null;
			return;
		}
		Node temp = head;
		Node last = null;

	while(head!=null){
		last = head;
		head = head.next;
	}
        last.next= new_node;
        head = temp;
	}

	void printList(Node head) {
        
		while(head!=null){
			
			System.out.print(head.data +"->");
			head= head.next;
		}
	}

}
