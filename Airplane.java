import java.util.*;
public class Airplane { 
	 
	  static void landing(String flight) {
			//for take off
			 Queue<String> Q1 
		     = new LinkedList<String>(); 
		 Q1.add(flight);
	 }
	static void takeOff(String flight) {
		 //for landing
		 Queue<String> Q2 
	     = new LinkedList<String>();
		 Q2.add(flight);
	 }
	 
	 public static void main(String[] args) {
		 System.out.println("inputs for takeoff and landing");
		 Scanner sc = new Scanner(System.in);
		 String ts = sc.nextLine();
		 
		 String ls = sc.nextLine();
		
		 landing(ls);
		 takeOff(ts);
		 Scanner sc1 = new Scanner(System.in);
		 String nex = sc1.nextLine().toUpperCase();
		 System.out.println(nex);
		 if(nex.equals("NEXT")) {
			 System.out.println("pop");
		 }else {
			 System.out.println(" mercy");
		 }
	 }
}
