
/*문제13. 달의 중력은 지구의 약 17%라고 한다. 자신의 몸무게를 입력하였을 때 달에서의 몸무게를 계산하는 자바프로그램을 작성하시오.
- 출력예 -
자신의 몸무게를 입력하세요 : 70
달에서의 몸무게는 11.9kg입니다.*/

package example;

import java.util.Scanner;

public class exam13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자신의 몸무게를 입력하세요: ");
		int var1 = sc.nextInt();

		double result = (double) var1 / 100 * 17;
		System.out.printf("달에서의 몸무게는 %1$2.1f입니다.", result);

	}

}
