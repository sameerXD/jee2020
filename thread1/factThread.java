package thread1;

public class factThread extends Thread {
    String threadName;
    int data, fact=1;
    
    factThread(String name, int value){
    	this.threadName = name;
    	this.data = value;
    }
    
    public void run() {
    	System.out.println(threadName);
    	for(int i=1;i<=data;i++){
    		fact=fact*i;
    		}
    	System.out.println(" factorial :" + fact) ;
    }
}
