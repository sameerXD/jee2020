package sataStruct;

public class queueAsLinkedList {
   Node front ,rear = null;
   
   class Node{
	   int data;
	   Node next;
	   Node(int d){
		   data = d;
		   next = null;
	   }
   }
   
   boolean underflow() {
	   if(front == null) {
		   return true;
	   }
	   return false;
   }
   
   void enqueue(int d) {
	   Node newNode = new Node(d);
	   if(underflow()) {
		  rear= front = newNode;
	   }else {
		   rear.next= newNode;
		   rear = newNode;
	   }
   }
   void dequeue() {
	   if(underflow()) {
		   System.out.println(" no element in the queue");
	   }else {
		   front = front.next;
		   if(front == null) {
			   rear = null;
		   }
	   }
   }
   void print() {
	   Node temp = front;
	   while(temp!=null) {
		   System.out.println(temp.data);
		   temp = temp.next;
	   }
   }
   
   public static void main (String[] args) {
	   queueAsLinkedList sam = new queueAsLinkedList();
	   
	   sam.enqueue(1);
	   sam.enqueue(2);
	   sam.enqueue(3);
	   sam.print();
	   System.out.println(" dequeue ");
	   sam.dequeue();
	   sam.print();
   }
}
