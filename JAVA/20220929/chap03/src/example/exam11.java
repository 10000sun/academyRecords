
/*문제11. 섭씨온도를 입력하면 화씨온도로 변환하여 출력하는 자바프로그램을 작성하시오.]
단, 화씨온도 = (9/5)*섭씨온도+32 이다.
- 출력예 -
섭씨온도를 입력하세요 : 23
화씨온도로 변화하면 73.4 (F)입니다.*/

package example;

import java.util.Scanner;

public class exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("섭씨 온도를 입력하세요.: ");
		int var1 = sc.nextInt();
		
		double var2 = 9.0/5.0*var1+32;
		
		System.out.printf("화씨온도로 변환하면 %1$2.1f(F) 입니다.", var2);

	}

}
