package assignment;



import java.io.File;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
//		 File file = new File("C:\\Users\\jarvis\\Desktop\\alice_in_wonderland.txt"); 
		  
//		  BufferedReader br = new BufferedReader(new FileReader(file)); 
//		  
//		  String st; 
//		  while ((st = br.readLine()) != null) 
//		    System.out.println(st+"end"); 
	    HashMap<String, Integer> book = new HashMap<String, Integer >();
		 Scanner sc = new Scanner(new File("C:\\Users\\jarvis\\Desktop\\alice_in_wonderland.txt"));
//		 String[] terms = sc.split("\\s+|[\\-\\+\\$\\?\\.@&].*");
		    while(sc.hasNext()){
		    	String s = sc.next();
		    	String k = s.replaceAll("[^a-zA-Z0-9]", " ");
		    	if (book.containsKey(k)) {
		    		int temp = book.get(k);
		    		temp = temp + 1;
		    		book.put(k,temp);		
		    	}else{
		    		book.put(k,1);
		    	};
		        
		        
		        
		        //.....

	}
System.out.println("the book is " + book);
}
}