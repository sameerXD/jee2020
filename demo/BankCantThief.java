package demo;

public class BankCantThief extends Thread {


		static int balance = 700;
		
		synchronized void withdrawl(int c,Thread k) throws InterruptedException {
			
			
			if(balance<200) {
				System.out.println("insufficient ammount let monica give u money waiting....");
				
					k.wait();
				
			}
			balance = balance - c;
		}
           void deposit(int c ,Thread t) {
			
			balance = balance + c;
			t.notify();
			System.out.println("resumed.....");
		}
		public static void main(String [] args) {
			System.out.println("start");
			Account1 john = new Account1("john", 200);
			Account1 monica = new Account1("monica", 200);
			john.start();
			monica.start();

			
			
		}
	}


