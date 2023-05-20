package javapracticepullreq;

class AB {
	
	public  void display(int n, int m) {
		System.out.println(n +"," + m);
	}
	
	public int sum(int p, int q) {
		return p+q;
	}
}




public class Classandobjects extends AB {

	public static void main(String[] args) {
		
    AB obj = new AB();
    obj.display(3, 5);
    int total = obj.sum(2, 3);
    System.out.println(total);
	}

}
