package javapracticepullreq;

public class Sumofelemetsinarray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		int lengtharrya = a.length;
		int sum=0;
		for(int i=0;i<=lengtharrya-1;i++) {
			sum = sum+a[i];
		}
		
		System.out.println(sum);

	}

}
