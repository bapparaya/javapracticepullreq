package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("name", "Tom");
		hm.put("dept", "Dev");
		hm.put("team", "Raman");
		//hm.remove("name");
		hm.put("reporter", "ashika");
		hm.replace("name", "peter");
		
		System.out.println(hm.get("name"));
		System.out.println(hm);
		
		for(Entry<String, String> rvalue: hm.entrySet()) {
			System.out.println(rvalue.getKey()+" "+rvalue.getValue());
		}
		System.out.println("===============================");	
		Employee e1 = new Employee("bappa",1,"QA");
		Employee e2 = new Employee("muthu",2,"forming");
		Employee e3 = new Employee("ram",3,"agri");
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> values:emp.entrySet()) {
			int key = values.getKey();
			Employee details = values.getValue();
			System.out.println("employe"+" "+key+" "+"info");
			System.out.println(details.empname+" "+details.empid+" "+details.dept);
			
		}
	}

}
