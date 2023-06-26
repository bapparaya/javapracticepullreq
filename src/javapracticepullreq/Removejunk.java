package javapracticepullreq;

public class Removejunk {

	public static void main(String[] args) {

		String s = "@#$cristiano+_#$07^&%**isnumber_#$%$01";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
