package javapracticepullreq;

public class Reverseeachwordinastring {

	public static void main(String[] args) {

		String str = "Selenium Automation Testing";
		
		String[] arrayString= str.split(" ");
		String reverseString="";
		for(String w:arrayString) {
			
			String reverseword="";
			
			for(int i=w.length()-1;i>=0;i--) {
				
				reverseword= reverseword+w.charAt(i);
				
			}
			
			reverseString=reverseString+reverseword+" ";
		}
		
		System.out.println(reverseString);
		
		
	}

}
