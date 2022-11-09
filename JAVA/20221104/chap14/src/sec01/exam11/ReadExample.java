package sec01.exam11;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader rd = new FileReader("D:/Temp/test7.txt");
		
		while(true) {
			int data = rd.read();
			if(data == -1) break;
			System.out.println((char)data);
		}
		rd.close();

	}

}
