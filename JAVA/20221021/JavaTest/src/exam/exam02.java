package exam;

import java.util.Scanner;

class ex03 {
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

class ex04 extends ex03 {
	void left(int x, int y) {
		System.out.println("나머지 : " + (x % y));
	}
}

public class exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex04 ex = new ex04();

		System.out.println("2개의 정수값을 입력하세요. : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		ex.plus(x, y);
		ex.minus(x, y);
		ex.multi(x, y);
		ex.division(x, y);
		ex.left(x, y);
	}

}
