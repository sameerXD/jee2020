package thread1;

public class priorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Priority p1 = new Priority("sam");
      Priority p2 = new Priority("john");
    
     
      p1.t.start();
      p2.t.start();
      
      p1.t.setPriority(Thread.MAX_PRIORITY);
      p2.t.setPriority(Thread.MIN_PRIORITY);
      try {
    	  p1.t.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      try {
    	  p2.t.join();
  	} catch (InterruptedException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
      
	}

}
