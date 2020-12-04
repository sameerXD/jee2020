package practice;

public class circularLinkedList {
  node head;
  
  class node{
	  node next;
	  int data;
	  node(int d){
		 data = d; 
		 next = null;
	  }}
	  void insert(int d) {
		  node newNode = new node(d);
		  node temp = head;
		  if(head == null) {
			  head = newNode;
			  head.next = head;
		  }else {
			  while(temp.next != head) {
				  temp = temp.next;
			  }
			  temp.next=newNode;
			  newNode.next= head;
		  }
	  }
	  void print() {
		  node temp = head;
		  while(temp.next!=head) {
			  System.out.println(temp.data);
			  temp = temp.next;
		  }
	  }
	  public static void main(String[] args) {
			circularLinkedList sam = new circularLinkedList();
			sam.insert(4);
			sam.insert(5);
			sam.insert(6);
			sam.insert(7);
			sam.print();
		  }
  }
 

