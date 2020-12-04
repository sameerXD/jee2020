package practice;

public class genericClass {
	
	public static <E> void itr(E[] inputArray){
		for(E x : inputArray) {
			System.out.println("> "+ x);
		}
	}
	public static void main(String [] args) {
		Integer[] a1 = {1,2,3,4};
		Double[] a2 = {1.1,2.3,4.4,2.3,4.4};
		String[] a3  = {"s","a","m","e","e","r"};
		itr(a1);
		itr(a2);
		itr(a3);
	}
     
}
