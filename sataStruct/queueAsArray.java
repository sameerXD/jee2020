package sataStruct;

public class queueAsArray {
	private static int front ,rear, capacity;
	private static int queue[];
	 queueAsArray(int c){
		 front =rear = 0 ;
		 capacity = c;
		queue =new int[capacity];
	}
	static boolean underflow() {
		if(front == rear) {
		return true;}else {
			return false;
		}
	}
	static boolean overflow() {
		if(rear==capacity) {
			return true;
		}else {
			return false;
		}
	}
	
	static void enqueue(int data) {
		if(overflow()) {
			System.out.println("there is no space ");
			return;
		}else {
			queue[rear] = data;
			rear++;
		}
	}
	static void dequeue() {
		if(underflow()) {
			System.out.println("no element in the queue ");
			return ;
		}
		else {
			for(int i =0 ;i<rear-1;i++) {
				queue[i]=queue[i+1];
			}
			
			if(rear<capacity) {
				queue[rear]= 0;
			}
			rear--; 	 	
			return;
		}
	}
	static void print() {
		for(int x : queue) {
		System.out.println(x);}
	}
   public static void main(String[] args) {
	   queueAsArray sam = new queueAsArray(3);
	   sam.enqueue(1);
	   sam.enqueue(2);
	   sam.enqueue(3);
	   sam.print();
	   sam.dequeue();
	   sam.print();
   }
}
