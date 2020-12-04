package practice;

public class stack {
  Node head;
  class Node{
	  Node next;
	  int data;
	  
	  Node(int d){
		  data = d;
		  next = null;
	  }
  }
  boolean empty() {
	  if (head == null) {
	     return true;}else {return false;}
  }
  void push(int d) {
	  Node newNode = new Node(d);
	  Node temp = head;
	  if(head == null) {
		  head =newNode;
		  System.out.println(newNode.data+" is pushed");
	  }else {
		  while(temp.next !=null) {
			  temp= temp.next;
		  }
		  temp.next = newNode;
		  System.out.println(newNode.data+" is pushed");
	  }
  }
  void pop() {
	  Node temp=head;
	  Node ltemp = null;
	  if(empty()) {
		  System.out.println("no element");
	  }else {
		  while(temp.next !=null) {
			  ltemp = temp;
			  temp= temp.next;
		  }
		  System.out.println(temp.data+" is deleted");
		  ltemp.next = null;
	  }
  }
  void printStack() {
	   Node temp = head;
	   while(temp.next!=null) {
		   System.out.println(temp.data);
		   temp = temp.next;}
  }
  public static void main(String[] args) {
	  stack sam = new stack();
	  sam.push(1);
	  sam.push(2);
	  sam.push(3);
	  sam.printStack();
  }
}
