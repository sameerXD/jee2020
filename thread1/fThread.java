package thread1;

public class fThread extends Thread{
	 String threadName;
	    int data, fact=1;
	    
	    fThread(String name, int value){
	    	this.threadName = name;
	    	this.data = value;
	    }
	    public void start() {
	    	System.out.println(threadName);
	    for (int i = 1; i <= data; ++i) {
	        if (data % i == 0) {
	          System.out.print(i + " ");
	        }
	      }
	    }
}
