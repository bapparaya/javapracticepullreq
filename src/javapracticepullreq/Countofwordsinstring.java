package javapracticepullreq;

import java.util.Scanner;

public class Countofwordsinstring {

	public static void main(String[] args) {

		System.out.println("please enter the string that u want to count the words");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count =1;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
				count++;
			}
		}
		
		System.out.println("no. of words in the given string is:"+ count);
		
		
	}

}
