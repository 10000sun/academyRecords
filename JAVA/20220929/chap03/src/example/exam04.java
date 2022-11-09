
/*문제4. 본봉과 보너스를 각각 입력받아 세금이 총 금액의 10%일때 실제 수입과 연봉을 출력하는 
 * 자바프로그램을 작성하시오.
- 출력예 -
본봉(단위:만원)을 입력하세요 : 200
보너스(단위:만원)를 입력하세요 : 20
총수입은 198.0만원이고 연봉은 2376.0만원입니다.*/

package example;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("본봉(단위:만원)을 입력하세요: ");
		int money1 = sc.nextInt();
		
		System.out.println("보너스(단위:만원)를 입력하세요: ");
		int money2 = sc.nextInt();
		
		double money3 = (double) (money1+money2)-(money1+money2)/10;
		double money4 = (double) money3*12;
		
		System.out.println("총 수입은 "+money3+"만원이고 연봉은 "+money4+"만원 입니다.");

	}

}
