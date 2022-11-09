package sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader rd = new FileReader("D:/Temp/test9.txt");

		char[] buffer = new char[5];

		int readCharNum = rd.read(buffer);
		if (readCharNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		rd.close();

	}

}
