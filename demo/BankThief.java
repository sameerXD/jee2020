package demo;

public class BankThief {
	static int balance = 1000;
	
	synchronized void withdrawl(int c) {
		if(balance<200) {
			System.out.println("insufficient ammount ");
			return;
		}
		balance = balance - c;
		
	}
	public static void main(String [] args) {
		Account john = new Account("john", 200);
		Account monica = new Account("monica", 200);
		john.start();
		monica.start();
	}

}
