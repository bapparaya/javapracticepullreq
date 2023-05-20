package javapracticepullreq;

class AB {
	
	public  void display(int n, int m) {
		System.out.println(n +"," + m);
	}
}




public class Classandobjects extends AB {

	public static void main(String[] args) {
		
    AB obj = new AB();
    obj.display(3, 5);
	}

}
