package javapracticepullreq;

public class Stringrevision {

	public static void main(String[] args) {

		String str = "bapparaya";
		
		//how to reverse a string without reverse method
		
		char[] ch = str.toCharArray();
		for(int i= ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		//reverse via charatindex
		System.out.println("====================");
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i); 
			
			 
		}
		System.out.println(reverse);
		
		System.out.println("====================");
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb.reverse());
		System.out.println("====================");
		StringBuilder sbd = new StringBuilder(str);
		System.out.println(sbd.reverse());
		System.out.println("====================");
		
		String str1 = "!@ba%raya*&";
		String removejunk = str1.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(removejunk);
		String spaceremoved = removejunk.replaceAll("\\s", "");
		System.out.println(spaceremoved);
		
		
	}

}
