package practice;

public class LinkedList1 {
    Node head;
    class Node{
    	int data;
    	Node next;
    	
    	Node(int d){
    		data = d;
    		next = null;
    	}
    }
    void insert(int d) {
		Node newNode = new Node(d);
    	if (head == null) {
    		head= newNode;
    	}else {
    		
    		Node temp = head;
    		while(temp.next!=null)
    			temp = temp.next;
    		temp.next = newNode;
    	}
    }
    void printList(LinkedList1 list) {
    	Node temp = list.head;
    	while(temp!=null) {
    		System.out.println(temp.data);
			temp = temp.next;}
    }
    Node prev(Node current,LinkedList1 list) {
    	Node temp = list.head;
    	Node ltemp=null;
    	while(temp.next!=current)
    		ltemp = temp;
    		temp = temp.next;
    		System.out.println("dd "+ltemp);
    	return ltemp;
    }
    void printReverse(LinkedList1 list) {
    	Node temp = list.head;
        Node ktemp=null;
    	while(temp.next!=null)
    		temp = temp.next;
    	
    	while(ktemp!=list.head) {
    		System.out.println(temp.data);
    		ktemp = list.prev(temp,list);
    		
    	}
    }
    public static void main(String[] args) {
    	LinkedList1 sam = new LinkedList1();
    	sam.insert(1);
    	sam.insert(2);
    	sam.insert(3);
    	sam.printList(sam);
    	sam.printReverse(sam);
    }
}
