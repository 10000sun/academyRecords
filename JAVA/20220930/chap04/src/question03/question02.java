
/*문제2. for 반복문을 사용하여 1부터 입력한 숫자까지의 합계를 구하는 자바프로그램을 작성하여 보시오.
- 출력예 -
정수를 입력하세요 : 50
1부터 50까지의 합계는 1275입니다.*/

package question03;

import java.util.Scanner;

public class question02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		int sum = 0;

		int i = 0;
		for (i = 1; i <= num; i++) {
			sum += i;
		}

		System.out.println("1부터 50까지의 합계는 "+sum+"입니다.");
	}

}

