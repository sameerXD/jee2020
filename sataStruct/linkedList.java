package sataStruct;

public class linkedList {
   Node head;
   
   static class Node {
	   int data;
	   Node next;
	   
	   Node(int d){
		   data = d;
		   next = null;
	   }
   }
   
   public static linkedList insert(linkedList list, int data) {
	   Node new_Node = new Node(data);
	   
	   if(list.head == null) {
		   list.head = new_Node;
	   }else {
		   Node last = list.head;
		   
		   while(last.next!=null) {
			   last = last.next;
		   }
		   
		   last.next = new_Node;
		 
	   }
	   return list;
   }
   
   public static void printList(linkedList list) {
	   Node p = list.head;
	   while(p!= null) {
		   System.out.println(p.data + "  ");
		   p = p.next;
	   }
	   
   }
   //deletion by key
   public static linkedList delete(linkedList list, int key) {
	   Node currentNode = list.head, prev = null;
	   
	   if(key == 1 && currentNode != null) {
		   list.head = currentNode.next;
		   
		   System.out.println(key + " has been deleted");
		   return list;	   
	   }
	   int curr = 0;
	 while(currentNode!=null && currentNode.data!=key ) {
		 prev = currentNode;
		 currentNode=currentNode.next;
	 } 
	 if(currentNode!= null) {
		 prev.next = currentNode.next;
		 System.out.println(key + " has been deleted");
	 }else {
		 System.out.println(key +" was not found");
	 }
  return list;	 
	   
   }
   
   //deletion by index
   public static linkedList deleteByindex(linkedList list , int index){
	   int count = 0;
	    Node currentNode = list.head, prev = null;
	    
	   if(index == 0 && list.head!=null) {
		   System.out.println("node at index " + index+ " has been deleted" + list.head.data);
		   list.head = currentNode.next;
		   return list;
	   }
	   
	   while(currentNode!= null) {
		   if(count==index) {
			   prev.next = currentNode.next;
			   System.out.println("node at index " + index+ " has been deleted");
			   break;
		   }else {
			   prev = currentNode;
			   currentNode= currentNode.next;
			   count++;
			  
		   }	
	   }
       if(currentNode == null) {
    	   System.out.println(index + " index was not found");
       }
	   return list;
   }
   public static void main(String[] args) {
	   linkedList sam = new linkedList();
	   
	   sam.insert(sam, 1);
	   sam.insert(sam, 2);
	   sam.insert(sam, 3);
	   sam.insert(sam, 4);
	   sam.insert(sam, 5);
  
	   sam.deleteByindex(sam, 0);
	   printList(sam);
	   
   }
}
