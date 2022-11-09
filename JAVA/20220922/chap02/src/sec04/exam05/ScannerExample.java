package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data;

		while (true) {
			data = sc.nextLine();
			System.out.println("입력된 문자열: \"" + data + "\"");
			if (data.equals("q")) {
				break;
			}
		}

	}

}
