package assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DriveAway {
  
   public static void main(String[] args) {
	   Stack<String> drive = new Stack<>();
	   Queue<String> street = new LinkedList<>();
	      
   drive.push("1");
   drive.add("2");
   drive.add("3");
   drive.add("4");
   drive.add("5");
   drive.add("6");
   
   while(!drive.isEmpty()) {
//	   System.out.println(drive.pop());
	   if(drive.peek()!="4")
	   { 
		  String g =  drive.pop();
		  street.add(g);
		  
	   }else {
		   drive.pop();
		   break;
	   }
   
   }
   while(!street.isEmpty()) {
	   String p = street.poll();
	   drive.push(p);
   }
   
   System.out.println(drive);
}}
