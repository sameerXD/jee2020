package practice;

public class guessGame {
	player p1 = new player(); 
	player p2 = new player(); 
	player p3 = new player(); 
	
	void startGame() {
		int guessP1 = 0;
		int guessP2 = 0;
		int guessP3 = 0;
		
		boolean p1IsRight = false;
		boolean p2IsRight = false;
		boolean p3IsRight = false;
		
		int targetNumber = (int)(Math.random()*10);
		System.out.println("i am thinking of a number..........");
		
		while(true) {
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessP1 = p1.number;
			guessP2 = p2.number;
			guessP3 = p3.number;
			
			System.out.println("player 1 guessed " + guessP1);
			System.out.println("player 2 guessed " + guessP2);
			System.out.println("player 3 guessed " + guessP3);
			
			if(guessP1 == targetNumber) {
				p1IsRight = true;
			}if(guessP2 == targetNumber) {
				p2IsRight = true;
			}if(guessP3 == targetNumber) {
				p3IsRight = true;
			}
			
			if(p1IsRight ||p2IsRight ||p3IsRight) {
				System.out.println("player 1 guessed " + guessP1 +" right " + p1IsRight);
				System.out.println("player 2 guessed  " + guessP2 +" right " + p2IsRight);
				System.out.println("player 3 guessed  " + guessP3 + " right " + p3IsRight);
				System.out.println("game over");
				break;
			}else {
				System.out.println("try harder!!");
			}
		}		
	}
}
