package assignment;

import java.util.Scanner;

public class ds {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//      System.out.println("Please give us the length of array");
//      Scanner length = new Scanner(System.in);
//      int len = length.nextInt();
//      int arr[] = new int[len];
//      
//      System.out.println("please enter the elements of array:");
//      
//      for(int i=0;i<len;i++) {
//    	  Scanner e = new Scanner(System.in);
//    	  int element = e.nextInt();
//    	  arr[i] = element;
//    	  
//      }
//       System.out.println("the array enterd is :");
//       for(int i=0;i<len;i++){
//    	   System.out.println(arr[i]);
//       }
//       
//       //sorting
//       int temp;
//       
//       for(int i = 1 ; i<len; i++) {
//    	   for(int j = i; j>0; j--) {
//    		   if(arr[j]<arr[j-1]) {
//    			   temp= arr[j];
//    			   arr[j]= arr[j-1];
//    			   arr[j-1] = temp;
//    			   
//    		   }
//    	   }
//       }
//       System.out.println("the sorted array is :");
//       for(int i=0;i<len;i++){
//    	   System.out.println(arr[i]);
//       }
//       System.out.println("diff between largest and smallest " + (arr[len-1] - arr[0]));
//      
//q2
//		int arr[] = new int[10];
//		System.out.println("Please give us 10 random numbers in array");
//		
//      for(int i=0;i<10;i++) {
//  	  Scanner e = new Scanner(System.in);
//  	  int element = e.nextInt();
//  	  arr[i] = element;
//  	  
//    }
//      //at even index
//      System.out.println("at even index");
//    for(int i=0;i<10;i++){
//    	if(i%2==0) {
//	   System.out.println(arr[i]);
//    	}   	
//  }
//      //odd number
//    System.out.println("odd number");
//    for(int i=0;i<10;i++){
//    	if(arr[i]%2!=0) {
//	   System.out.println(arr[i]);
//    	}      
//    }
//    //reverse order
//    System.out.println("reverse order");
//    for(int i=9;i>=0;i--){
//    	
//	   System.out.println(arr[i]);
//    	     
//    }
//    
//    
// 
		//q3
	int arr[] = new int[5];
	
	System.out.println("Please give us 5 random numbers in array");
		
      for(int i=0;i<5;i++) {
  	  Scanner e = new Scanner(System.in);
  	  int element = e.nextInt();
  	  arr[i] = element;
  	  
    }
      int temp = 0;
    for(int i=4;i>=0;i--){
  	   temp = temp + arr[i];	     
  }	
    System.out.println("the sum of array is" + temp);
		
	}
}

		


