package thread1;

public class mainThread {
  public static void main(String [] args) {
	  factThread f1 = new factThread("f1", 4);
	  fThread f2 = new fThread("factors", 4);
	  f1.start();
	  try {
		f1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  f2.start();
	  try {
		f2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
