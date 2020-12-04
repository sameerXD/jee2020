package generics;

import java.util.ArrayList;

class Test<T>{
	ArrayList<T> obj = new ArrayList<T>();

	public ArrayList<T> getObj() {
		return obj;
				}
	
	public int checkOddEven(ArrayList<T> obj){
		int oddCount = 0 ;
		int evenCount =0 ;
		
		for(T x: obj) {
//			int y = x;
			if((int)x%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			
		}
		System.out.println("there are even :" + evenCount + "odd: " + oddCount);
		return evenCount;
	}
	public int checkPal(ArrayList<T> obj){
		int palCount = 0;
		String b = "";
		for(T x: obj) {
			String y = String.valueOf(x); 
	        int n = y.length();

	        for(int i = n - 1; i >= 0; i--)

	        {

	            b = b + y.charAt(i);

	        }

	        if(y.equalsIgnoreCase(b))

	        {

	            palCount++;

	        }

	    }
		 System.out.println("values that are palindrome" + palCount);

	       return palCount;
		}
	}
	
public class q1 {
	public static void main(String[] args) {
    Test<Integer> o = new Test<Integer>();
    o.obj.add(10);
    
    Test<String> o1 = new Test<String>();
    o1.obj.add("sas");
    o.checkOddEven(o.obj);
    o1.checkPal(o1.obj);
    
	}
}
