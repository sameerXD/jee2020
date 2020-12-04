package ThreadPractice;

public class RandomThread extends Thread{
  private String threadName;
  
  RandomThread(String name){
	  this.threadName = name;
  }
  
  public void run() {
	  for(int i = 0 ; i<5; i++) {
	  int random = (int)(Math.random()*100);
	  if(random%2==0) {
		  secondThread second = new secondThread("harry", random);
		  second.start();
	  }else {
		  System.out.println("random value is" + random);
	  }
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }}
  
}
