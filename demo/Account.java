package demo;

 public class Account extends Thread {
	int dep ;
	String threadName;
   Account(String n,int c){
	  dep = c;
	  threadName = n;
  }
    public void run(){
	  BankThief t1 =new BankThief();
	  System.out.println("thread name :" + threadName);
	  for(int i =0;i<5 ;i++) {
		  t1.withdrawl(dep);
		  System.out.println("balance after depletion " + t1.balance);
		}
	  
  }
}
