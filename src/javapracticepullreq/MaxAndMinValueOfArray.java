package javapracticepullreq;

public class MaxAndMinValueOfArray {

	public static void main(String[] args) {
		
		int a[]= {20,100,50,80,5};
		
//		int max = a[0];
//		
//		for(int i=1;i<=a.length-1;i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//		}
//		
//		System.out.println(max);
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
