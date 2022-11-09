package sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer wr = new FileWriter("D:/Temp/test10.txt");

		String str = "ABC";

		wr.write(str);

		wr.flush();
		wr.close();

	}

}
