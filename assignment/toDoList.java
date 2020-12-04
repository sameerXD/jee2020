package assignment;

import java.util.Scanner;
import java.util.Stack;

public class toDoList {
  public static void main(String[] args) {
	  Stack<String> st = new Stack<>(); 
	  
	   int y = 1;
	  while(y!=0) {
		  System.out.println("type 1 to add and type 2 deletion 0 to exit");
		  Scanner  sc = new Scanner(System.in); 
		   y = sc.nextInt(); 
		   
		   if(y==1) {
			   System.out.println("give input ");
			   Scanner str = new Scanner(System.in);
			   String sr= str.nextLine();
			   st.push(sr);
			 
			   System.out.println(st);
		   }else if(y==2) {
			   System.out.println(st.peek() + " is to be removed ");
			   st.pop();
			   System.out.println(st);
		   }else if(y==0) {
			   break;
		   }
	  }
  }
}
