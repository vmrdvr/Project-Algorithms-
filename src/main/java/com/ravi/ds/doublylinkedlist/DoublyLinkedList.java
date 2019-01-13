package com.ravi.ds.doublylinkedlist;

public class DoublyLinkedList {

	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {

			this.data = data;
		}
	}

	public static void main(String[] args) {

		DoublyLinkedList dl = new DoublyLinkedList();
		//appends the data at the end of DLL
		dl.append(5);
		dl.append(3);
		dl.append(10);
		dl.append(56);
		dl.append(16);
		//pushes the data at front and makes it head of DLL
		dl.push(9);
		dl.push(100);
		dl.push(23);
		dl.printList(dl.head);
		System.out.println();
		System.out.println("*** After Deleting ***");
		//deletes the data at any given position
		dl.delete(16);
		//prints the DLL forward and reverse direction
		dl.printList(dl.head);

	}

	void append(int d) {

		Node n1 = new Node(d);

		if(head==null){
			n1.prev=null;
			head = n1;
			return;
		}
		
		Node last = head;
		
		while(last.next!=null){
			
			last = last.next;
				
		}
		
		last.next = n1;
		n1.prev = last;
		return;

	}
	void push(int n){
		Node new_n = new Node(n);
		new_n.next = head;
		new_n.prev=null;
		
		if(head!=null){
			
			head.prev=new_n;
		}
		head=new_n;
		return;
		
	}
	//Deletes any given element from DLL & if not found prints message 
	void delete(int n){
		Node delete = new Node(n);
		Node temp = null;
		Node temp1=head;
		
		if(delete.data== head.data){
		temp = head.next;
		temp.prev =null;
		
		head= temp;
		return;
		}
			while(head.next.data!=delete.data){
		head = head.next;
			
			if(head.next==null){
				head = temp1;
				System.out.println("## Element Not found ##");
				return;
			}
		}
		
		if(head.next.next!=null){
			temp = head.next.next;
			temp.prev= head;
			head.next=temp;
			head=temp1;
			return;
		}
		head.next=null;
		head = temp1;
		return;
		
	}
	void printList(Node n){
		
		Node last = null;
		System.out.println("printing in forward direction");
		while(n!=null){
			
			System.out.print(n.data+ "->");
			last = n;
			n =n.next;
		}
		System.out.println();
		System.out.println("printing in reverse order");
		while(last!=null){
			
			System.out.print(last.data+"->");
			last = last.prev;
			
		}
		
	}

}
