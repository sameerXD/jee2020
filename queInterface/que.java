package queInterface;
import java.util.LinkedList;
import java.util.Queue;

import java.util.Iterator;

public class que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Queue<String> queuel = new LinkedList<String>();
      
      //inserting
      queuel.add("nokia");
      queuel.add("rog");
      queuel.add("apple");
      queuel.add("realme");
      queuel.add("xiomi");
      
      
      queuel.offer("huawie");
      
      
      System.out.println(queuel); 
      
      System.out.println("iterating........");
      
		Iterator<String> itr = queuel.iterator();
      	
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
      }
	};
	
	

}
