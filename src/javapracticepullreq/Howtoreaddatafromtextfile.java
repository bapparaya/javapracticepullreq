package javapracticepullreq;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Howtoreaddatafromtextfile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\bapparayar\\git\\javapracticepullreq\\src\\javapracticepullreq\\testfile.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String brv;
		
		while((brv=br.readLine())!=null)
		{
			System.out.println(brv);
		}
		
	}

}
