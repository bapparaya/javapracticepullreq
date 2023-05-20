/*
 * added by bappa
 */


package javapracticepullreq;

class A{
	
	int num=10;
	
	public void display() {
		System.out.println(num);
	}
}


public class Inheritance extends A {

	public static void main(String[] args) {
		
		Inheritance obj= new Inheritance();
		obj.display();
		

	}

}
