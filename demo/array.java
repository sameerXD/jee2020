package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.ListIterator;


public class array {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		ArrayList<String> lol = new ArrayList<String>();
		
		File file = new File("C:\\Users\\Jarvis\\Desktop\\test.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		 String st; 
		  while ((st = br.readLine()) != null) {
		   String[] words = st.split(" ");
//		   System.out.println(words[0]);
		   for (int i=0;i<words.length;i++) {
			   lol.add(words[i]);
			   
		   }
		   
		   }
		  
		  System.out.println("my array list is " + lol.size());
		  
		ListIterator<String> obj = lol.listIterator();
		
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		System.out.println("-------------------------------------------");
		for (int i = lol.size() - 1; i >= 0; i--) { 
			  
			 System.out.println(lol.get(i)); 
        } 
			
      
	}
	
	

}
