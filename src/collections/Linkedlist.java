package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add("bappa");
		ll.add("ramji");
		
		System.out.println(ll);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("selenium");
		ll1.add("java");
		ll1.add("test");
		
		System.out.println(ll1);
		System.out.println(ll1.size());
		ll1.add("kantime");
		System.out.println(ll1.size());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(ll1);
		System.out.println(ll1.get(0));
		ll1.addFirst("bappa");
		ll1.addLast("raya");
		System.out.println(ll1);
		ll1.remove(0);
		System.out.println(ll1);
		ll1.set(0, "bappa");
		System.out.println(ll1);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		int num = 0;
		while(ll1.size()>num) {
			System.out.println(ll1.get(num));
			num++;
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		Iterator<String> it = ll1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
	}

}
