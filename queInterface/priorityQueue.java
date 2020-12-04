package queInterface;

import java.util.PriorityQueue;

import java.util.Iterator;

public class priorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PriorityQueue<Integer> sam = new PriorityQueue<>();
      PriorityQueue<String> sameer = new PriorityQueue<>();
      
      sameer.add("sameer");
      sameer.add("anuj");
      sameer.add("tanuj");
      sameer.add("anjali");
      sameer.add("tushar");
      
      System.out.println("the string heep" + sameer);
      
      sam.add(22);
      sam.add(90);
      sam.add(2);
      sam.add(80);
      sam.add(11);
      
      System.out.println(sam);
      
      System.out.println("peak value:" + sam.peek());
      
      System.out.println("delete the top t	hrough poll" + sam.poll());
      
      Iterator<Integer> itr = sam.iterator();
      
      System.out.println("iterating over the updated queue");
      
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
      }
      
	}

}
