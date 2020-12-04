package sataStruct;

public class StackAsArray {
     int top;
     static final int max = 1000;
     int arr[] = new int[max];
     
      boolean isEmpty() {
    	 return (top<0);
     }
      boolean isFull() {
    	  return (top>=(max-1));
      }
      
      StackAsArray(){
    	  top = -1;
      }
      
      public boolean push(int d) {
    	  if(isFull()) {
    		  System.out.println("overflow ");
    		  return false;
    	  }
    	  arr[++top] = d;
    	  System.out.println(d + " is pushed to stack ");
    	  return true;
      }
      public boolean pop() {
    	  if(isEmpty()) {
    		  System.out.println(" underflow ");
    		  return false;
    	  }
    	  int p = arr[top--];
    	  System.out.println(p + " poped");
    	  return true;
      }
      public boolean peek() {
    	  if(isEmpty()) {
    		  System.out.println( " underflow");
    		  return false;
    	  }
    	  int p = arr[top];
    	  System.out.println(p);
    	  return true;
      }
      public void printStack() {
    	  for(int i = 0;i<=top; i++) {
    	  System.out.println(arr[i]);}
      }
      public static void main(String[] args) {
    	  StackAsArray sam = new StackAsArray();
    	  sam.push(0);
    	  sam.push(1);
    	  sam.push(2);
    	  sam.push(3);
    	  sam.pop();
    	  sam.peek();
    	  
          sam.printStack();
      }
}
