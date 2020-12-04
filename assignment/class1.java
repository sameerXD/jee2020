package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class class1 {
  public static void main(String[] args) throws FileNotFoundException {
	  ArrayList<String> words = new ArrayList<>();
	  int uCount = 0;
	  
	  File text = new File("C:\\Users\\Jarvis\\Desktop\\alice_in_wonderland.txt");
	  Scanner str = new Scanner(text);
	  System.out.println("putting them in list");
	  while(str.hasNext()) {
		  String Line = str.next(); 
//		  Line = Line.replaceAll(".$", " ");
		  Line = Line.replaceAll("[^a-zA-Z0-9]", "");
		  
		  words.add(Line); 
	  }
	  System.out.println("printing the list words");
	  
	  Iterator<String> w =  words.iterator();
	  
	  while(w.hasNext()) {
		  System.out.println(w.next());
	  }
	  System.out.println("reversing-------------------------------------");
	  for(int i = words.size()-1 ; i>=0 ; i-- ) {
		  System.out.println(words.get(i));
	  }
	  System.out.println("removing and printing plural ===============================");
	  for(int i = 0 ; i<=words.size()-1;i++) {
		  
		  String s = words.get(i);
		  if(Character.toUpperCase(s.charAt(s.length()-1)) == 'S') {
			  System.out.println(s);
			  uCount++;
			  words.remove(i);
		  }
		  
	  }
	  System.out.println("total plural were " + uCount +" all removed");
  }
}
