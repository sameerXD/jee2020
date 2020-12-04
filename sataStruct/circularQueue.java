package sataStruct;

import sataStruct.queueAsLinkedList.Node;

public class circularQueue {
   Node front ,rear = null;
   class Node{
	   int data;
	   Node next;
	   
	   Node(int d){
		   data = d;
		   next=null;
	   }
   }
   
   void enqueue(int d) {
	   Node newNode = new Node(d);
	   if(front==null) {
		   newNode.next =front;
		 front = rear = newNode;
		 
	   }else {
		   newNode.next = front;
		   rear.next= newNode;
		   rear = newNode;
	   }
   }
   
   void dequeue() {
	   if(front==rear) {
		   front = rear =null;
	   }else {
		   front = front.next;
		   rear.next = front;
	   }
	   
   }
   void display() {
	   Node temp = front;
	   while(temp.next!=front) {
		   System.out.println(temp.data);
		   temp = temp.next;
	   }System.out.println(temp.data);
   }
   
   public static void main(String[] args) {
	   circularQueue sam = new circularQueue();
	   sam.enqueue(1);
	   sam.enqueue(2);
	   sam.enqueue(3);
	   sam.display();
	   System.out.println("dequeue ");
	   sam.dequeue();
	   sam.display();
   }
}
