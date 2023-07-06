package javapracticepullreq;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writeintotextfile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\bapparayar\\git\\javapracticepullreq\\src\\javapracticepullreq\\write.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("bappa is writing into the file");
		System.out.println("finishied");
		bw.close();
		
		
		
		
	}

}
