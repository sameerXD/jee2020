package thread1;

public class Priority implements Runnable{
	int count;
	String threadName;
	static boolean stop =false;
	 Thread t;
	Priority(String name){
		t = new Thread(this,name);
		threadName = name;
		 count =0;
	}
  public void run() {
	  //iterate for t0 000000 times
	 
	  System.out.println("starting thread" + threadName);
	  
	  while(count <= 1000 && stop == false) {
		  count++;
		  
		  System.out.println("executing " + threadName+ " inside loop");
		  
	  }
	  stop = true;
	  System.out.println("terminating " + threadName+ " " +count);
  }
}
