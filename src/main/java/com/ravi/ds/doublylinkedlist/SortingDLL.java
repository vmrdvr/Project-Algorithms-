package com.ravi.ds.doublylinkedlist;

import com.ravi.ds.doublylinkedlist.DoublyLinkedList.Node;

public class SortingDLL {
	
	static void sortDLL(Node head){
		Node temp = null;
		Node node = null;
		
		Node first = head;
		Node sec = head.next;
		if(head == null ){
			System.out.println("No elements in DLL");
			return;
		}
		while(head!= null){
			
			if(first.data > sec.data){
				
			}else{
				sec = sec.next;
			}
		
		}
		
	}

	public static void main(String[] args) {
		
		DoublyLinkedList dl = new DoublyLinkedList();

		// appends the data at the end of DLL
		dl.append(5);
		dl.append(3);
		dl.append(10);
		dl.append(56);
		dl.append(16);
		// pushes the data at front and makes it head of DLL
		dl.push(9);
		dl.push(100);
		dl.push(23);
		dl.printList(dl.head);
sortDLL(dl.head);
		
	}
}
