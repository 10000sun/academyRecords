package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer wr = new FileWriter("D:/Temp/test9.txt");

		char[] array = { 'A', 'B', 'C', 'D', 'E'};

		wr.write(array, 1, 3);

		wr.flush();
		wr.close();

	}

}
