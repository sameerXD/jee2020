package TwoComponent;


import java.util.Scanner;

public class twosComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please give us the length of number");
		Scanner inp = new Scanner(System.in);
		int array_length = inp.nextInt();
		
		System.out.println("please give us a number to find 2's compliment::");
		
	    Scanner in = new Scanner(System.in); 
	    
	    int num = in.nextInt();
	    
	    System.out.println("the number you gave is " + num +" and the length " +array_length);
	    
	    int number[] = new int[array_length] ;
	    int j = 0;
	    
	    while(num!=0) {
	    	number[j]= num%10;
	    	num/=10;
	    	j++;
	    }
	    
	    
	    
	    if (number[0]==1) {
	    	System.out.println("shortcut");
	    	for(int i=1;i<number.length;i++) {
	    		if(number[i]==1) {
	    			number[i] = 0;
	    		}else {
	    			number[i]= 1;
	    		}
	    	}
	    }else {
	    	System.out.println("no shortcut");
	    	for(int i=2;i<number.length;i++) {
	    		if(number[i]==1) {
	    			number[i] = 0;
	    		}else {
	    			number[i]= 1;
	    		}
	    	}
	    }
	    System.out.println("Your 2's compliment is--------------------");
	    for(int i =number.length-1 ; i>=0 ; i--) {
	    	System.out.print(number[i]);
	    }
	}

}
