
/*문제10. 전력을 계산하여 출력예와 같이 출력하는 자바프로그램을 작성하시오.
- 출력예 -
전류를 입력하세요 : 3
저항을 입력하세요 : 2
구하고자 하는 전력값은 18(와트)입니다.*/

package example;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전류를 입력하세요.: ");
		int var1 = sc.nextInt();
		
		System.out.println("저항을 입력하세요.: ");
		int var2 = sc.nextInt();
		
		int var3= var1*var2;
		
		System.out.println("구하고자 하는 전력값은 "+var1*var3+"와트 입니다.");

	}

}
