package javapracticepullreq;

public class EvenOddInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
//		for(int i=0; i<=a.length-1; i++) {
//			
//			if(a[i]%2==0) {
//				System.out.println(a[i]);
//			}else {
//				System.out.println("odd numbers are" + a[i]);
//			}
//		}
		
		for(int b:a) {
			if(b%2==0) {
				System.out.println(b);
			}
			
		}

	}

}
