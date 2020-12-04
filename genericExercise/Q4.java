package genericExercise;

public class Q4 {
    public static <E> void printArr(E[] arr) {
    	for(E x : arr) {
    		System.out.println("> "+x);
    	}
    }
    
    public static void main(String [] args) {
    	Integer[] a1 = {1,2,3,4};
    	String[] a2 = {"a","b","c"};
    	
    	printArr(a1);
    	printArr(a2);
    }
}
