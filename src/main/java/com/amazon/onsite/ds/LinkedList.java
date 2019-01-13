package com.amazon.onsite.ds;

public class LinkedList {

	public Node head;

	public LinkedList(){
		
	}
	public LinkedList(Node head) {
		this.head = head;
	}
	
	public void append(Node data){
		Node temp=head;
		while(temp.next!=null){
			
			temp=temp.next;
			
			
		}
		
		temp.next=data;
	}
	 
	 public void swapping(int n1, int n2){
		 
		 Node prev =null; 
		 
		 if(head == null)return;
		 
		 while(head.next!=null && head.data!=n1){
			 
			 prev=head;
			 head =head.next;
		 }
		 
		 prev.next.data=n2;
		 n2=head.data;
		 
		 Node temp=null;
		 while(head.next!=null && head.data!=n2){
			 
			 temp = head;
			 head = head.next;
		 }
		 temp.next.data=n1;
		 n1=head.data;
	 }
	 
	 Node reverseLinkedList(Node node){
		 
		 Node prev = null;
		 Node next =null;
		 Node curr = node;
		 
		 while(curr!=null){
			 
			 next = curr.next;
			 
			 curr.next = prev;
			
			 prev = curr;
			 
			 curr = next;
			
			 
		 }
		 node = prev;
		 
		 return node;
		 
	 }
	 
	 int length(){
		 
		 Node temp =head;
		int count=0;
		 while(temp!=null){
			 count++;
			 temp=temp.next;
			 
			 
		 }
		 
		 return count;
	 }

	public void printList(Node node) {
		Node n = node;
		int count =0;
		while (n != null) {
			//removing 2nd element in ll
/*			if(count ==1){
				
				n = n.next;

			}*/
			try{
				System.out.print(n.data + "->");
				n = n.next;
			}catch(NullPointerException e){
				
				System.out.println("No Value in the list to remove");
			}
			
			count++;
	
		}

	}
public static void main(String[] args) {

		Node head = new Node(5);
		Node node1 = new Node(4);
		Node node2 = new Node(3);
		Node app= new Node(6);
		LinkedList ll = new LinkedList(head);

		ll.head.next = node1;
		
		Node new_node = new Node(10);
		// Insert a node
		node1.next = new_node;
		new_node.next = node2;

		ll.append(app);
		
		// Delete a node
		//ll.head.next = new_node;
		//ll.swapping(new_node.data,app.data);
		
		//ll.printList();
		
	
		System.out.println("Length : " +ll.length());
		
		System.out.println("After reversing");
		 ll.printList(ll.reverseLinkedList(head));
	}
}
