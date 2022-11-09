package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer wr = new FileWriter("D:/Temp/test8.txt");

		char[] array = { 'A', 'B', 'C' };

		wr.write(array);

		wr.flush();
		wr.close();

	}

}
