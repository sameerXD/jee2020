package node;
import java.io.*;

public class linkedList {
	
  Node head;
  //static class so that main can read it
  static class Node{
	  int data;
	  Node next;
	  //constructor
	  
	  Node(int d){
		  data = d;
		  next = null;
	  }
	  
  }
  
  //function to insert new node
  
  public static linkedList insert(linkedList list , int data) {
	  Node new_node = new Node(data);
	  new_node.next = null;
	  
	  if (list.head==null) {
		  list.head = new_node;
	  }else {
		  Node last = list.head;
		  
		  while(last.next!=null) {
			  last= last.next;
		  }
		  last.next = new_node;
	  }
	  return list;
  }

  public static void main(String[] args) {
	  linkedList list = new linkedList();
	  list = insert(list,1);
	  System.out.println("done");
  }
  
}
