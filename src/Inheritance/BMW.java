package Inheritance;

public class BMW implements Inheritance1 {
	
	public void start() {
		System.out.println("start method");
	}
	
	public void stop() {
		System.out.println("stop method");
	}
	
	public void selfdrive() {
		System.out.println("selfdrive method");
	}

	public static void main(String[] args) {
		
		BMW obj = new BMW();
		obj.start();
		obj.stop();
		obj.selfdrive();
		}

}
