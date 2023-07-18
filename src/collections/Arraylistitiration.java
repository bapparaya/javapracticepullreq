package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistitiration {

	public static void main(String[] args) {

		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("bappa");
		ar.add("muthu");
		ar.add("shanth");
		ar.add("ramji");
		
		System.out.println(ar);
		/*iteration
		 * 1.simple for loop
		 * 2.for each loop
		 * 3.iterator object
		 */
		System.out.println("------------------using simple for loop------------------");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("------------------using for each loop------------------");
		for(String ar1:ar) {
			System.out.println(ar1);
		}
		
		System.out.println("------------------using iterator------------------");
		
		Iterator it = ar.iterator();
		while(it.hasNext()) {
			//String value = (String) it.next();
			System.out.println(it.next());
		}
	}

}
