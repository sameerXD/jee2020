package ThreadPractice;

public class secondThread extends Thread{
	  private String threadName;
	  private int num;
	  
	  secondThread(String name , int random){
		  this.threadName = name;
		  this.num = random;
	  }
	  
	  public void run() {
		 num = num*num;
		 System.out.println(" square is :" + num	);
	  }
}
