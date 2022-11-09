package exam;

import java.util.Scanner;

class ex01 {
	void plus(int x, int y) {
		System.out.println("덧셈 : " + (x + y));
	}

	void minus(int x, int y) {
		System.out.println("뺄셈 : " + (x - y));
	}

	void multi(int x, int y) {
		System.out.println("곱셈 : " + (x * y));
	}

	void division(int x, int y) {
		System.out.println("나눗셈 : " + (x / y));
	}
}

public class exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex01 ex = new ex01();

		System.out.println("2개의 정수값을 입력하세요. : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		ex.plus(x, y);
		ex.minus(x, y);
		ex.multi(x, y);
		ex.division(x, y);
	}

}
