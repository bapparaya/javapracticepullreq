/*
 * bappa
 */

package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList ar = new ArrayList();
	//jhhjh
	
	ar.add(10);
	ar.add(20);
	ar.add(30);
	
	System.out.println(ar.size());
	
	ar.add(50);
	ar.add("bappa");
	
	System.out.println(ar.size());
	
	System.out.println(ar.get(0));
	System.out.println("############################");
	
	for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}
	
	System.out.println("############################");
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>();
	ar1.add(100);
	
	ArrayList<String> ar2 = new ArrayList<String>();
	ar2.add("selenium");
	System.out.println("############################");
	
	Employee e1= new Employee("bappa",25,"QA");
	Employee e2 = new Employee("tom",30,"Dev");
	Employee e3 = new Employee("Peter", 28,"admin");
	
	ArrayList<Employee> ar3 = new ArrayList<Employee>();
	ar3.add(e1);
	ar3.add(e2);
	ar3.add(e1);
	
	Iterator<Employee> it = ar3.iterator();
	while(it.hasNext()) {
		Employee e = it.next();
		System.out.println(e.empname);
		System.out.println(e.empid);
		System.out.println(e.dept);

	}
	
	System.out.println("############################");
	
	ArrayList<String> ar4 = new ArrayList<String>();
	ar4.add("bappa");
	ar4.add("java");
	ar4.add("selenium");
	
	ArrayList<String> ar5 = new ArrayList<String>();
	ar5.add("muthu");
	ar5.add("agri");
	ar5.add("land");
	
	ar4.addAll(ar5);
	for(int i=0;i<ar4.size();i++) {
		System.out.println(ar4.get(i));
	}
	
	
	
	}

}
