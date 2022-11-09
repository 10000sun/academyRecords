
/*문제2. 나이를 입력받아 19세 이상이면 "성년", 19세 미만이면 "미성년"이라고 출력하는 자바프로그램을 작성하시오.*/

package question02;

import java.util.Scanner;

public class question02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		int age = sc.nextInt();
		
		if(age >= 19) {
			System.out.println("성년");
		} else {
			System.out.println("미성년");
		}

	}

}
