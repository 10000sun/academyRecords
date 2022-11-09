
/*문제2. 상점에 가면 우리는 상품에 대한 돈을 내고 영수증을 받는다. 영수증에는 잔돈 등이 
 * 인쇄되어 있다. 구입한 상품의 가격과 손님한테 받은 금액을 입력하면 잔돈을 출력하는 
 * 자바프로그램을 작성하여 보시오.
- 출력예 -
받은 돈 입력 : 10000
상품의 총액 입력 : 7500
남은 잔돈은 2500원 입니다.*/

package example;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("받은 돈 입력: ");
		int money1 = sc.nextInt();
		
		System.out.println("상품의 총 금액 입력: ");
		int money2 = sc.nextInt();
		
		System.out.println("남은 잔돈은 "+(money1-money2)+"원 입니다.");

	}

}
