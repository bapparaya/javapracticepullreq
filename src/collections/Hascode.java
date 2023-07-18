package collections;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Hascode {

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		ht.put("name", "bappa");
		ht.put("role", "QA");
		ht.put("city", "banglore");
		
		System.out.println(ht);
		System.out.println(ht.hashCode());
		
	Hashtable ht1 = new Hashtable();
	
	ht1 = (Hashtable) ht.clone();
	System.out.println("value of ht1"+ht1);
	ht.remove("name");
	System.out.println(ht);
	System.out.println("value of ht1"+ht1);
		
		
		
		
		
		
		
		
	}

}
