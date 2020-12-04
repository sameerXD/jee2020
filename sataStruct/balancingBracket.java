package sataStruct;

public class balancingBracket {
     Node head;
     
     class Node{
    	String data;
    	 Node next;
    	 
    	 Node(String d){
    		 data = d;
    		 next = null;
    	 }
    	 
     }
     
     boolean isEmpty(){
    	 return (head==null);
     }
     
     public void push(String d) {
   	 Node newNode = new Node(d);
//    	 if(isEmpty()) {
//    		 head = newNode;
//    		 head.next=new
//    		 System.out.println("pushed " + head.data);
//    	 }else {
    		 newNode.next = head;
    		 head = newNode;
    		 System.out.println("pushed " + head.data);
    	  	 
    	 
     }
     public String pop() {
    	 if(isEmpty()) {
    		 System.out.println(" underflow");
    		 return " underflow";
    	 }else {
    		 Node temp =head;
    		 System.out.println("poped " + head.data);
    		 head = head.next;
    		 return temp.data;
    	 }
     }
     
     public void print() {
    	 Node temp = head;
    	 if(isEmpty()) {
    		 System.out.println(" underflow ");
    		 return;
    	 }else {
    		 while(temp!=null) {
    			 System.out.println(temp.data);
    			 temp= temp.next;
    		 }
    	 }
     }
     public static boolean balance(String s) {
    	 balancingBracket sam = new balancingBracket();
    	 for(int i = 0 ; i<=s.length()-1; i++) {
    		// if(i==0&&s.charAt(i)==']'||s.charAt(i)==')'||s.charAt(i)=='}') {System.out.println("unbalanced stack ");return false;}
    		 if(s.charAt(i)=='['||s.charAt(i)=='('||s.charAt(i)=='{') {
    			 System.out.println("step " + i);
    			 String x = Character.toString(s.charAt(i));
    			 sam.push(x);
    		 }else if(s.charAt(i)==']'||s.charAt(i)==')'||s.charAt(i)=='}') {
    			 System.out.println("step " + i);
    			 char c = sam.pop().charAt(0);
    			 System.out.println( c+" to be checked :" +"to "+ s.charAt(i));
//    			 if(c!=s.charAt(i)) {
//    				 System.out.println("unbalanced stack ");return false;
//    			 }
    			 switch(s.charAt(i)) {
    			 case ')': if(c!='(') {System.out.println("unbalanced ");break;}
    			 case ']': if(c!='(') {System.out.println("unbalanced ");break;}
    			 case '}': if(c!='(') {System.out.println("unbalanced ");break;}
    			 }
    			 if(!sam.isEmpty()) {
    				 System.out.println("unbalanced ");
    				 return false;
    			 }
    		 }
    	 }
    	 System.out.println(" balanced ");
    	 return true;
     }
     
     public static void main(String[] args) {
    	 
    	 balance("{}()");
     }
     }


