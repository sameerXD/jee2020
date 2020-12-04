package hacker;

public class QueueFriquency {
  Node front ,rear = null;
 
  class Node {
	  int data;
	  Node next;
	  Node(int d){
		  data = d;
		  next= null;
	  }
  }
  
  void enqueue(int d) {
	  Node newNode = new Node(d);
	  newNode.next = front;
	  if(front == null) {
		  newNode.next = newNode;
		  front= newNode;
	  }else{
		  Node temp = front;
		  while(temp.next!= front) {
			  temp = temp.next;
		  }
		  temp.next = newNode;
	  }}
  void dequeue() {
	  Node rear = front;
	  int  frequency = 0;
	  System.out.println(front.data + " is to be dequeued");
	  
	  while(rear.next != front) {
		  if (rear.data == front.data) {
			  frequency ++;
		  }
		  rear= rear.next;
	  }
	  System.out.println(" and its frequency "+ frequency);
	  front = front.next;
	  rear = front;
  }
  void print() {
	  Node temp = front;
	  if (front == null) {
		  System.out.println("empty");
	  }
	  while(temp.next != front) {
		  System.out.println(temp.data);
		  temp = temp.next;
	  }System.out.println(temp.data);
  }
  public static void main(String [] args) {
	  QueueFriquency sam = new QueueFriquency();
	  sam.enqueue(1);
	  sam.enqueue(1);
	  sam.enqueue(1);
	  sam.enqueue(3);
	  sam.dequeue();
	  sam.print();
  }
}
