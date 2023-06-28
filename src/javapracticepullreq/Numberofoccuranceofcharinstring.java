package javapracticepullreq;

public class Numberofoccuranceofcharinstring {

	public static void main(String[] args) {

		String str = "java   programing java opps";
		
		int totalcount = str.length();
		int afterremovinga = str.replaceAll("[p]", "").length();
		int occurance = totalcount-afterremovinga;
		System.out.println("number of occurace of a given charector is: " + occurance);
		
	}

}
