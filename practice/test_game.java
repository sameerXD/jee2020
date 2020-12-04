package practice;
import java.util.Scanner;

class g{
	private int[] defLoc;
	private int hit = 0;
	private String result = "miss";
	public void setLocation(int[] loc) {
		defLoc = loc;
	}
	
	public String checkYourself(String user) {
		int user1 = Integer.parseInt(user);
		
		for(int t : defLoc) {
			if (user1 == t) {
				hit++;
				result = "critical hit";
				t= 0;
				break;
			}
			}
			
			if(hit == defLoc.length) {
				result = "perfect kill";
				
			}
			
			System.out.println(result);
			return result;
			
		
	}
}

class gameHelper{
	private String input = null;
	
	public String getUserInput(String prompt) {
		System.out.println(prompt + " ");
		Scanner myObj  =new Scanner(System.in); 
		input = myObj.nextLine();
		
		if(input.length()==0) {
			return null;
		}else {
			return input;
		}
	}
}


public class test_game {
	public static void main(String[] args) {
		int numOfGuess = 0;
		boolean isAlive = true;
		int randomNum = (int)(Math.random() * 5);
		
		g g1 = new g();
		gameHelper helper = new gameHelper();
	    int[] passLoc={randomNum,randomNum+1,randomNum+2};
		
		
		g1.setLocation(passLoc);
		
		
		while(isAlive) {
			String user = helper.getUserInput("enter a number");
			String result = g1.checkYourself(user);
			numOfGuess++;
			
			if(result=="perfect kill") {
				isAlive = false;
				System.out.println("Game over .....chances taken are " + numOfGuess);
			}
		}
		
		
		
		
	}
   
   
}
