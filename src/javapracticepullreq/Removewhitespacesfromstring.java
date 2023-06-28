package javapracticepullreq;

public class Removewhitespacesfromstring {

	public static void main(String[] args) {

	String str="Ramji empire is    intiated by      ramji and it will be build by bappa and muthu";
	
	str = str.replaceAll("\\s", "_");
	System.out.println(str);
	
	
	
	}

}
