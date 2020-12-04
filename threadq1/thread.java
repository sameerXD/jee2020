package threadq1;


public class thread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse t1 = new reverse(0);
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	

}

