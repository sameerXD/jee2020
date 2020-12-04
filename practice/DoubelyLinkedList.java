package practice;

public class DoubelyLinkedList {
  Node head;

  
  class Node{
	  int data;
	  Node prev;
	  Node next;
	  Node(int d){
		  data = d;
		  next = null;
		  prev = null;
	  }
  }
  
  void insert(int d) {
	  Node newNode = new Node(d);
	  Node temp = head;
	  if(head == null) {
		  head = newNode;
	  }else {
	  while(temp.next!=null) {
		  temp = temp.next;
	  }
	  temp.next = newNode;
	  newNode.prev= temp;
	  }
  }
  
   void insertIndex(int index,int data) {
	   Node newNode = new Node(data);
	   Node temp = head;
	   Node ltemp =null;
	   int i =0;
	   while(i!=index && temp!=null) {
		   i++;ltemp = temp;temp = temp.next;
	   }
	   if(i!=index) {
		   System.out.println("index is not available");
	   }else {ltemp.next=newNode;newNode.prev=ltemp;temp.prev=newNode;newNode.next = temp;}
   }
  void print() { 
	  Node temp = head;
	  while(temp!=null) {
		  System.out.println(temp.data);
		  temp = temp.next;
	  }
  }
  void reverse() {
	  Node temp = head;
	  if(head==null) {
		  System.out.println(" empty DoubelyLinkedList list");
	  }else
		  while(temp.next!=null) {
			  temp = temp.next;
		  }
	      while(temp!=null) {
	    	  System.out.println(temp.data);
	    	  temp= temp.prev;}
  }
  
  public static void main(String [] args) {
  DoubelyLinkedList sam = new DoubelyLinkedList();
  sam.insert(1);
  sam.insert(2);
  sam.insert(3);
  sam.insertIndex(1, 99);
  sam.print();
  System.out.println(sam.head.prev);
  sam.reverse();
 
  }
}
