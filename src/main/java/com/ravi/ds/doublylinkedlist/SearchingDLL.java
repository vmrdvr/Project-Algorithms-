package com.ravi.ds.doublylinkedlist;

import com.ravi.ds.doublylinkedlist.DoublyLinkedList.Node;

public class SearchingDLL {

	static void searchForElement(int n, Node head) {

		if (head.data == n) {
			System.out.println("Element found at index 1 ");
		}
		int index = 1;
		while (head.data != n && head.next != null) {

			head = head.next;
			index++;
		}
		if (head.next == null) {

			System.out.println("Element Not found");
			return;
		}else{
			
			System.out.println("Element Found At Index " + index);
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

		searchForElement(78, dl.head);

	}
}
