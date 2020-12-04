
class getset {
	
	private int sam;
	
	public int getsam() {
		return sam;
	}
	
	public void setsam(int s) {
		sam = s;
	}
	
	void bark() {
		if (sam<30) {
			System.out.println("hey i am young");
		}else if(sam>30 & sam<90){
			System.out.println("i am old");
		}else {
			System.out.println("i am dead");
		}
	}

}

class start{
	public static void main(String[] args) {
		getset sam1 = new getset();
		
		sam1.setsam(20);
		sam1.bark();
}}
