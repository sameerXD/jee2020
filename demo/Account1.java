package demo;

public class Account1 extends Thread{
	int dep ;
	String threadName;
   Account1(String n,int c){
	  dep = c;
	  threadName = n;
  }
    public void run(){
	  BankCantThief t1 =new BankCantThief();
	  System.out.println("thread name :" + threadName);
	  if(this.threadName=="monica") {
		  t1.deposit(200,this);
		  System.out.println("deposited " + 200 + " by" + this.threadName);
		  
	  }

	  for(int i =0;i<5 ;i++) {
		  //		  if(this.threadName=="john") {
		  try {
			t1.withdrawl(dep,this);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("balance after depletion " + t1.balance + " by " + this.threadName);
		}
	  
  }
}
