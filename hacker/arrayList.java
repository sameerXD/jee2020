package hacker;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
   public static void main(String [] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  ArrayList<Integer> sam = new ArrayList<>();
	  if(n>1 && n<20000) {
		  for(int i = 1;i<=n;i++) {
			  
			  int d =sc.nextInt();
			  sam.add(d);
		  System.out.println(d);
			  for( i = 1; i<=d;i++) {
				 int y =sc.nextInt();
				  System.out.println(y);
				  //sam.add(y);
			  }
		  }
		  
	  }else {System.out.println("error"); }
	  
	  int q = sc.nextInt();
	  if(q>1 && q<1000) {
		  
	  }
   }
}
