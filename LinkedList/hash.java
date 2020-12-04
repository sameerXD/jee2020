package LinkedList;

import java.util.HashSet;
import java.util.Iterator;



public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<String> auto = new HashSet<>();
        HashSet<String> auto2 = new HashSet<>();
        
        auto.add("bmw");
        auto.add("maruti");
        auto.add("porsche");
        auto.add("farrari");
        auto.add("jaguar");
        auto.add("jaguar");
        
        auto2.add("hector");
        auto2.add("nexus");
        auto2.add("lamborgini");
        auto2.add("toyota");
        auto.add("tesla");
        auto2.add("jaguar");
        
        System.out.println("the elements are" + auto);
        
        auto.remove("bmw");
        
        Iterator<String> itr = auto.iterator();
        
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        //union intersection difference search
        
        auto.retainAll(auto2);
        System.out.println("the intersection is " + auto );
        
        auto.addAll(auto2);
        
        System.out.println("the union is " + auto);
        
        auto2.removeAll(auto);
        
        System.out.println("the difference is " + auto);
        
        System.out.println(auto + " " + auto.contains("nexus"));
	}

}
