
public class four_method {
	public static void main(String[] args) {
		dog d1 = new dog();
		  d1.bark(3);
	}
  
}

 class dog {
	void bark(int b) {
		while(b>0) {
			System.out.println("woof! woof !");
			b= b-1;
		}
	}
}
