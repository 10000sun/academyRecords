
/*문제7. 2개의 정수를 입력받아 해당하는 번호를 선택하면 사칙연산을 하는 자바프로그램을 작성하여 보시오.
- 출력예 -
2개의 정수를 입력하세요 : 20 30
사칙연산을 선택하세요. (1) 덧셈 (2) 뺄셈 (3) 곱셈 (4) 나눗셈 (5) 종료
1
입력하신 정수의 덧셈은 50입니다.*/

package question02;

import java.util.Scanner;

public class question07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("두개의 정수를 입력하세요.");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result1 = num1+num2;
		int result2 = num1-num2;
		int result3 = num1*num2;
		int result4 = num1/num2;

		System.out.println("사칙연산을 선택하세요. (1)덧셈 (2)뺄셈 (3)곱셈 (4)나눗셈 (5)종료");

		int choose = sc.nextInt();

		switch (choose) {
		case 1:
			System.out.println(num1 + "과 " + num2 + "의 덧셈은" + result1 + "입니다.");
			break;
		case 2:
			System.out.println(num1 + "과 " + num2 + "의 뺄셈은" + result2 + "입니다.");
			break;
		case 3:
			System.out.println(num1 + "과 " + num2 + "의 곱셈은" + result3 + "입니다.");
			break;
		case 4:
			System.out.println(num1 + "과 " + num2 + "의 나눗셈은" + result4 + "입니다.");
			break;
		case 5:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			System.exit(0);
		}

	}

}
