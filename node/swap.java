
package node;
import java.io.*;

import node.linkedList.Node;

public class swap { 
	  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    }
    //insertion
    public void addNode(int data) {
    	Node newNode = new Node(data);
    	
    	if (head == null) {
    		head = newNode;
    	}else {
    		Node current = head;
    		while(current.next!=null) {
    			current = current.next;
    		}
    		current.next = newNode;
    	}
    }
    
    //swap
    
    public void swapLastWithFirst() {
    	Node current = head ;
    	Node temp = null;
    	Node index = null;
    	
    	if(head == null) {
    		return;
    	}else  {
    		while(current.next!=null) {
    			index = current;
    			current = current.next;
    		}
    		if(head == current) {
    			return ;
    		}else if(head.next == current)
    		{
    			temp = head;
    			
    			head = current;
    			
    			head.next = temp;
    			
    			temp.next = null;
    			
    			}else {
    				temp = head;
    				head = current;
    				
    				head.next = temp.next;
    				
    				index.next = temp;
    				
    				temp.next = null;
    			}
    		}
    }
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
    public static void main(String[] args) {  
        
        swap sList = new swap();  
          
        //Add nodes to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(4);  
   
        System.out.println("Originals list: ");  
        sList.display();  
          
        //Swaps Last node with first node  
        sList.swapLastWithFirst();  
          
        System.out.println("List after swapping the first node with last: ");  
        sList.display();  
    }  
}