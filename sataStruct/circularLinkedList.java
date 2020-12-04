package sataStruct;

public class circularLinkedList {
     Node head;
     
     class Node{
    	 int data;
    	 Node next;
    	 
    	 Node(int d){
    		 data = d;
    		 next = null;
    	 }
     }
     
     public Node push(Node head,int value) {
    	 Node newNode = new Node(value);
    	 Node last = head;
    	 newNode.next = head;
    	 if(head ==null) {
    		 newNode.next=newNode;
    		 head = newNode;
    		 return head;
    	 }    	 
    	 while(last.next!=head) {
    		 last = last.next;
    	 }
    	 
    	 last.next = newNode;
    	 return head;
     }	
     
     public void printList(Node head) {
    	 Node temp = head;
    	 if(head == null) {
    		 System.out.println("error empty list");
    		 return;
    	 }
    	  do {
    		 System.out.println(temp.data + " ");
    		 temp= temp.next;
    	 }while(temp!=head);
     }
     
     public static void main(String[] args) {
    	 circularLinkedList sam = new circularLinkedList(); 
    	 Node head = null;
    	 head = sam.push(head,0);
    	 head = sam.push(head,1);
    	 head =sam.push(head,2);
    	 head =sam.push(head,3);
    	 
    	 sam.printList(head);
     }
     
}
