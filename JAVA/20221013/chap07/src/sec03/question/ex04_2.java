
/*문제4-2. 문제4-1에서 나머지를 출력하는 기능을 상속을 이용하여 자식클래스를 출력하는 자바프로그램을 작성하여 보시오.
2개의 값을 입력하세요 : 5 2
덧셈 : 7
뺄셈 : 3
곱셈 : 10
나눗셈 : 2
나머지 : 1*/

package sec03.question;

import java.util.Scanner;

class Rest extends Answer {
	int Rest(int x, int y) {
		return x % y;
	}
}

public class ex04_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Answer ans = new Answer();
		Rest rest = new Rest();
		System.out.println("2개의 값을 입력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();

		int Plus = ans.pl(x, y);
		int Minus = ans.min(x, y);
		int Multi = ans.mul(x, y);
		double Divide = ans.div(x, y);
		double Rest = rest.Rest(x, y);

		System.out.println("덧셈 : " + Plus);
		System.out.println("밸셈 : " + Minus);
		System.out.println("곱셈 : " + Multi);
		System.out.println("나눗셈 : " + Divide);
		System.out.println("나머지 : " + Rest);
	}
}
