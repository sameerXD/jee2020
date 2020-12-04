package sataStruct;

public class TreeAsDoubelyLinkedList {
	Node head;
	class Node{
		Node left;
		Node right;
		int data;
		Node(int d){
			left = right = null;
			data = d;
		}
	}
	
	void Root(int d) {
		 head = new Node(d);
//		head.data = d;
	}
	
	void insertLeft(int d, Node n){
		Node newNode = new Node(d);
		n.left = newNode;
	}
	
	void insertRight(int d, Node n) {
		Node newNode = new Node(d);
		n.right = newNode;
	}
	
	void print(){
		Node temp = head;
		while(temp!= null) {
			System.out.println(temp.data);
			temp = temp.right;
		}
	}
	public static void main(String [] args) {
	   TreeAsDoubelyLinkedList sam = new TreeAsDoubelyLinkedList();
	   sam.Root(1);
	   sam.insertLeft(2, sam.head);
	   sam.insertRight(3, sam.head);
	   sam.insertLeft(4, sam.head.left);
	   sam.insertRight(5, sam.head.left);
	   sam.print();
	}
  
}
