
/*문제4-1. 사용자로부터 정수값 2개를 입력받아서 덧셈, 뺄셈, 곱셈, 나눗셈 연산을 하여 출력하는 자바프로그램을 작성하시오. 
 * 단, 메소드를 사용하여 풀이하시오.
- 출력예 -
2개의 값을 입력하세요 : 5 2
덧셈 : 7
뺄셈 : 3
곱셈 : 10
나눗셈 : 2*/

package sec03.question;

import java.util.Scanner;

class Answer{
	int pl(int x, int y) {
		return x+y;
	}
	int min(int x, int y) {
		return x-y;
	}
	int mul(int x, int y) {
		return x*y;
	}
	double div(int x, int y) {
		return x/y;
	}
}

public class ex04_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Answer ans = new Answer();
		System.out.println("2개의 값을 입력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int Plus = ans.pl(x, y);
		int Minus = ans.min(x, y);
		int Multi = ans.mul(x, y);
		double Divide = ans.div(x, y);
		
		System.out.println("덧셈 : "+Plus);
		System.out.println("밸셈 : "+Minus);
		System.out.println("곱셈 : "+Multi);
		System.out.println("나눗셈 : "+Divide);
	}
}
