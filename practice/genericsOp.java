package practice;

public class genericsOp {
    public static <T extends Comparable<T>> T max(T x,T y,T z) {
    	T max = x;
    	if(y.compareTo(max)>0) {
    		max = y;
    	}
    	if(z.compareTo(max)>0) {
    		max = z;
    	}
    	return max;
    }
    public static void main (String[] args) {
    	System.out.println("max of Integers "+ max(3,4,5));
    	System.out.println("max of float "+ max(3.9,4.0,5.8));
    	System.out.println("max of Chars "+ max('a','c','b'));
    	
    }
}
