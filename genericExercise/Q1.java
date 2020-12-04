package genericExercise;

public class Q1 {
    public static <E> void abc(E[] arr) {
    	for(E x: arr) {
    		int n = (int) x;
    		if(n%2==0) {
    			System.out.println("its an even number ");
    		}else {
    			System.out.println("its odd ");
    		}
    		int temp1 = n;
    		int temp = 0;
    		while(temp1!=0) {
    			int r = temp1%10;
    			temp= temp*10 + r;
    			temp1=temp1/10;
    			
    		}
    		if(temp == n) {System.out.println("its a palindrome " +temp);}else {System.out.println(" not a palindrome" +temp);};
    	}
    }
    public static void main(String[] args)
{Integer[] a1 = {414};
    	abc(a1);}}
