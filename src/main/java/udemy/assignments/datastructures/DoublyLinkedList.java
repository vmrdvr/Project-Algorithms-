package udemy.assignments.datastructures;

public class DoublyLinkedList {

	DoublyLinkedNode head;
	

	public void insert(int data){
		
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		
		newNode.setNext(this.head);
		
		if(this.head!=null){
			
			this.head.setPrevious(newNode);
		}
		this.head.setNext(null);
		newNode.setPrevious(null);
	}
}
