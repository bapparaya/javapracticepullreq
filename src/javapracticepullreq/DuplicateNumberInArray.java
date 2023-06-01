package javapracticepullreq;

import java.util.HashSet;

public class DuplicateNumberInArray {

	public static void main(String[] args) {

		String a[] = {"java", "c++","python","java"};
//		boolean flag=false;
//		for(int i=0;i<a.length;i++) {
//			
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.println("found the number the number is " + a[i] + ","+a[j]);
//					flag=true;
//				}
//			}
//		}
//	
//		if(flag==false) {
//			System.out.println("duplicate element not found");
//		}
		
		HashSet <String>langs = new HashSet();
		boolean flag = false;
		for(String l:a) {
			if(langs.add(l)==false) {
				System.out.println("it is a duplicate number" + l);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("there are not duplucate elemtns");
		}
	}

}
