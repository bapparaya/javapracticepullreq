package Inheritance;

public class Benz extends Abstraction {

	public void start() {
		System.out.println("start");
	}
	
		public static void main(String[] args) {
		

			Benz obj = new Benz();
			obj.start();
			obj.selfdrive();

	}

}

