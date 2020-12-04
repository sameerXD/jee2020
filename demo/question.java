package demo;

public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		int[] array1 = {8,65,43434,88};
		String[] array2 = {"sameer","rahul","pankaj"};
		int temp;
		
		for(int i = 1 ; i<array1.length;i++) {
			for(int j= i;j >0;j--) {
			if (array1[j]<array1[j-1]) {
				temp = array1[j];
				array1[j]=array1[j-1];
				array1[j-1]= temp;
			}}
			
		}
		for (int i = 0; i < array1.length; i++) {
		     System.out.println(array1[i]);
		   }
	  
		
//		for(int i = 0 ; i<array2.length ; i++ ) {
//			for(int j = i+1 ; j<array2.length; i++) {
//				if (array2[i].compareTo(array2[j]>0)) {
//						String temp = array2[i];
//							array2[i] = array2[j];
//							  array2[j] = temp;
//						
//				}
//			}
		
		for(int i =0 ; i<=5;i++) {
			System.out.println();
			for(int j = 0;j<=5; j++) {
				System.out.print("*");
		}
		}
		
		//////0 and 1
		
		int[] binary = {0,1,0,1,0,1};
		int count0 = 0;
		int count1 = 0;
		
		for(int data: binary) {
		 if (data==1) {
			 count1++;
		 }else {
			count0++; 
		 }
		}
//		System.out.println(count0+" " + count1);
//		int[] temp;
//		for(int i = 0; i<=count0 ; i++ ) {
//			temp[i] = 0;
//		}
//		
//		for(int i = 0; i<=count1; i++) {
//			temp[i]= 1;
//		}
//		
		
		}
 
	}
	


