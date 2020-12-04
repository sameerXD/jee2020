package sataStruct;

public class PriorityQueueAsDoubely {
  Node front,rear=null;
  class Node{
	  int data;
	  int priority;
	  Node next ,prev = null;
	  Node(int d, int p){
	  
	  priority= p;
	  data = d;
	  }
	  
  }
	void enqueue(int d , int p) {
		Node newNode = new Node(d,p);
				
		if(front == null) {
			System.out.println("1");
//			newNode.prev = newNode;
			front = newNode;
			rear = newNode;
			
		}else {
			System.out.println("2");

		Node temp = front;
		if (p <= (temp).priority) {
			System.out.println("3");

           newNode.next = front;
           front.prev = newNode;
           front = newNode;
        }  
		  else if (p > rear.priority) {  
				System.out.println("4");

	            newNode.next = null;
	            newNode.prev = rear;  
	            
	            (rear).next = newNode;  
	            rear = newNode;
	         
	        }  
    
		  else {  
				System.out.println("5");

			  Node start = front;
			  while(p<start.priority) {
				  start = start.next;
			  }
			  Node t1 = start.next; 
			  newNode.next = t1;
			  start.next = newNode;
			 
			  newNode.prev = start;
			  t1.prev = newNode;
		
  
	        }  }	
		
		
		
	}
	void print() {
		Node temp = front;
		while(temp.next!= null) {
			System.out.println(temp.data+ " p : "+ temp.priority);
			temp = temp.next;
		}
		System.out.println(temp.data+ " p : "+ temp.priority);
	}
	
	public static void main(String [] args) {
		PriorityQueueAsDoubely sam = new PriorityQueueAsDoubely();
		sam.enqueue(3, 10);
     	sam.enqueue(38, 1);
     	sam.enqueue(30, 5);
        sam.enqueue(32, 2);
        sam.enqueue(35, 4);
		sam.print();
	}
  
}
