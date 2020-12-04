package practice;

 class o {
   int wheel = 3;
   String name = "maruti";
   
   public void lol() {
	   System.out.println("you are dead");
   }
}

class o1 extends o{
	int body = 3;
}

class inheritance {
	public static void main(String[] args) {
		o1 l = new o1();
		l.lol();
		System.out.println(" "+ l.wheel + " " + l.body);
	}
}