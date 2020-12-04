package practice;

public class player {
	
		int number = 0;
		
		void guess() {
			number = (int)(Math.random() * 10);
			System.out.println("i am thinking " + number);
		}
	
}
