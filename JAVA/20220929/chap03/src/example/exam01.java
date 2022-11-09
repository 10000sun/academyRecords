
/*문제1. 아래와 같이 2개의 정수를 입력 받아 출력하는 자바프로그램을 작성하여 보시오.
- 출력예 -
두 정수를 입력하세요 : 10 3
나눗셈 연산식은 10 / 3 = 3.333입니다.*/

package example;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요: ");
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		double result = (double)(var1/var2);
		
		System.out.println("나눗셈 연산식은 " +var1+" / " +var2+ " = " +result+ "입니다.");

	}

}
