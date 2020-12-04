package sataStruct;

class doublyLinkedList{
	Node head;
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int d){
			data = d;
		}
	}
	
	public void push(int value) {
      Node newNode = new Node(value);
      if (head == null) {
			newNode.next= head;
			newNode.prev = null;
			head = newNode;
		}else {
			newNode.next= head;
			newNode.prev = null;
			head = newNode;
		}
	}
	
	public void printList(doublyLinkedList list) {
		Node temp = list.head;
		while(temp!= null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void insertAfter(Node prevNode , int value) {
		if(prevNode ==null) {
			System.out.println(" error there is no previous node as such ");
			return;
		}
		Node newNode = new Node(value);
		newNode.prev = prevNode;
		newNode.next = prevNode.next;
		
		prevNode.next = newNode;
		if(newNode.next!=null) {
			newNode.next.prev = newNode;
		}	
	}
	public void append(int value) {
		Node newNode = new Node(value);
		Node temp = head;
		newNode.next = null;
		if(head == null){
			head = newNode;
			return;
		}
		while(temp.next!=null) {
			temp= temp.next;
		}		
		temp.next = newNode;
		newNode.prev = temp;
	}
	public static void main(String[] args) {
		doublyLinkedList sam = new doublyLinkedList();
		sam.push(0);
		sam.push(1);
		sam.push(2);
		sam.push(3);
		sam.push(4);
		sam.insertAfter(sam.head.next, 78);
		sam.append(5);
		sam.printList(sam);
	} 	
}