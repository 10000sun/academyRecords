
/*문제9. 몸무게와 키를 입력받아 신체질량지수(BMI)를 구하는 자바프로그램을 작성하시오.
단, bmi = 몸무게(kg)/키(m)의 제곱
- 출력예 -
이름을 입력하세요 : 홍길동
몸무게를 입력하세요 (kg) : 45
키를 입력하세요 (m) : 1.68
홍길동님의 bmi는 15.9입니다.*/

package example;

import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String var1 = sc.nextLine();
		System.out.println("몸무게를 입력하세요 (kg): ");
		int var2 = sc.nextInt();
		System.out.println("키를 입력하세요 (m): ");
		double var3 = sc.nextDouble();
		
		double result = var2/(var3*var3);
		
		System.out.printf("%1$s님의 bmi는 %2$2.2f 입니다.", var1, result);
	}

}
