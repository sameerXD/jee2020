package practice;

class Dog {
	int size;
	String breed;
	String name;
	
	void bark() {
		System.out.println("ruff! ruff!");
	}
}

public class oop {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		
		d.size = 10;
		
		d.breed = "german shephard";
		
		d.name = "lucy";
		
		System.out.println("breed of the dog " + d.breed + " and the name is" + d.name + " and the last hear it bark " );                                                                 
		d.bark();
	}

	
}
