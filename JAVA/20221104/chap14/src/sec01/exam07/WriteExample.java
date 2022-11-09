package sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer wr = new FileWriter("D:/Temp/test7.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		wr.write(a);
		wr.write(b);
		wr.write(c);
		
		wr.flush();
		wr.close();

	}

}
