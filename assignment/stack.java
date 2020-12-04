package assignment;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
    	String sen = "Mary had a little lamb. Its fleece was white as snow.";
    	
    	Stack<String> st = new Stack<>();
    	Stack<String> st1 = new Stack<>();
    	int l = 0;
    	for(int i = 0 ; i<= sen.length()-1 ; i++) {
    		char c = sen.charAt(i);
    		if(c=='.') {
    			break;
    		}else {
    			 st.push(Character.toString(sen.charAt(i)));
    			 l=i;
    			
    		}}
    	for( int k = l+1 ; k<= sen.length()-1 ; k++) {
    		st1.push(Character.toString(sen.charAt(k)));
    	}
    	 
        while (!st.isEmpty()) 
        { 
            System.out.print(st.pop()); 
        } 
    
        while (!st1.isEmpty()) 
        { 
            System.out.print(st1.pop()); 
        } 
    
    	
    }
}
