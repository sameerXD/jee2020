package assignment;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import LinkedList.stack;

public class assinment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //initialisation
		Stack<Integer> Driveway = new Stack<>();
		
		//putting cars into driveway
		
		Driveway.push(1);
		Driveway.push(2);
		Driveway.push(3);
		Driveway.push(4);
		Driveway.push(5);
		Driveway.push(6);
		Driveway.push(7);
		
		//displaying cars parked in driveway
		
		System.out.println("The cars parked inside the driveway are" + Driveway);
		
		System.out.println("license plate numbers");
		Scanner number = new Scanner(System.in);
		
		int numb = number.nextInt();
		
		//initialising queue
		
		Queue<Integer> tempDriveaway = new LinkedList<>();
		
		
		
		
		//iterate inside a stack
		
		
		while(Driveway.peek() != null) {
			System.out.println("inside the stack");
			if(Driveway.peek()!=numb) {
				Integer l1=Driveway.pop();
				tempDriveaway.add(l1);
				
			}else {
				Driveway.pop();
				break;
			}
		}
		
		for(int value:tempDriveaway) {
			Driveway.add(value);
		}
		
		System.out.println("the updated Driveaway is " + Driveway);
		System.out.println("the temporary driveaway is " + tempDriveaway);
		
	
	}

}
