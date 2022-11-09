
/*문제5. 정수 세 개의 곱을 구하여 출력하는 자바프로그램을 작성하여 보시오.
- 출력예 -
세 개의 정수를 입력하세요 : 2 30 40
정수 2, 30, 40의 곱은 2400입니다.*/

package example;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 개의 정수를 입력하세요: ");
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		int var3 = sc.nextInt();
		
		int result = var1*var2*var3;
		
		System.out.println("정수"+var1+", "+var2+", "+var3+"의 곱은 "+result+"입니다.");

	}

}
