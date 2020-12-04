package sataStruct;

public class stackAsLinkedList {
    Node head;
    
    class Node{
    	int data;
    	Node next;
    	
    	Node(int d){
    		data = d;
    		next = null;
    	}  	
    }
    stackAsLinkedList(){
		head = null;
	}
    
    boolean isEmpty() {
    	return(head == null); 
    }
   boolean push(int d) {
	   Node newNode =  new Node(d);
	   if(isEmpty()) {
//		   System.out.println( " underflow");
		   head = newNode;
		   return false;
	   }	
	   
	   newNode.next= head;
	   head = newNode;
	   return true;
   }
   void print() {
	   Node temp = head;
	   while(temp!= null) {
		   System.out.println(temp.data + " ");
		   temp = temp.next;
	   }
   }
   
   boolean pop() {
	   if(isEmpty()) {
		   System.out.println(" the stack is underflow");
		   return false;
	   }
	   System.out.println(head.data+ " is poped");
	   head = head.next;
	   return true;
   }
   public static void main (String [] args) {
	   stackAsLinkedList sam = new stackAsLinkedList();
	   sam.push(89);
	   sam.push(1);
	   sam.push(2);
	   sam.push(3);
	   sam.pop();
	   sam.pop();
	   sam.pop();
	   sam.pop();
	   sam.pop();
	   sam.print();
   }
   }

