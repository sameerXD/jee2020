package threadq1;

public class reverse extends thread {
	int x ;
	int n;
   reverse(int data){
	   this.n= data;
	  
   }
   public void start() {
	   

	    while(n<5){
			n++;
			reverse t = new reverse(n);
			t.start();
			 try{  
				  t.join();  
				 }catch(Exception e){System.out.println(e);} 
			 		 
		}
	  
	    System.out.println("this is" + n);	
   }
}
