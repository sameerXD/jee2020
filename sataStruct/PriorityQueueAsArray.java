package sataStruct;

public class PriorityQueueAsArray {
   int front,rear = -1;
   int capacity;
   int priority;
   private static int queue[];
   
   PriorityQueueAsArray(int c){
	   capacity = c;
	   queue = new int[capacity];
   }
   
   void enqueue(int c) {
	   if(rear ==(capacity-1)) {
		   System.out.println("overflow");
		   return;
	   }
	   if(front == -1) {
		   front++;
	   }
	   rear++;
	   queue[rear] = c;
   }
   
   void dequeue() {
	   if(front == -1 ) {
		   System.out.println("underflow");
	   }
	   for(int i =0 ;i<=capacity-2;i++) {
		   if(queue[i]>queue[i+1]) {
			   priority = i;
		   }
	   }
	   System.out.println(queue[priority] + " is dequeued");
	   for(int i =priority ;i<rear-1;i++) {
			queue[i]=queue[i+1];
		}
   }
   
   void print() {
	   for(int x: queue) {
		   System.out.println(x);
	   }
   }
   public static void main(String[] args) {
	   PriorityQueueAsArray sam= new PriorityQueueAsArray(5);
	   sam.enqueue(1);
	   sam.enqueue(2);
	   sam.enqueue(3);
	   sam.enqueue(4);
	   sam.enqueue(5);
	   sam.print();
	   sam.dequeue();
	   sam.print();
   }
}
