package example;

import java.io.IOException;

public class example1 {

	public static void main(String[] args) {
		System.out.println("이름 : 홍길동");
		System.out.println("키 : 180cm, 몸무게 : 70.5kg");
		pause();

	}

	private static void pause() {
		try {
			System.in.read();
		} catch (IOException e) {
		}
	}

}
