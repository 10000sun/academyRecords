
/*문제8. 정수를 무한반복 입력받아서 합계를 누적하는 자바프로그램을 작성하여 보시오. 단, 합계가 500 이상이면 반복문을 종료하시오.
- 출력예 -
정수를 입력하세요 : 50
현재까지의 합계는 50입니다.
정수를 입력하세요 : 300
현재까지의 합계는 350입니다.
정수를 입력하세요 : 100
현재까지의 합계는 450입니다.
정수를 입력하세요 : 100*/

package question03;

import java.util.Scanner;

public class question08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hap = 0;
		
		while(true) {
			System.out.println("정수를 입력하세요 : ");
			hap += sc.nextInt();
			System.out.println("현재까지의 합계는 "+hap+"입니다.");
			if(hap >= 500) {
				break;
			}
		} System.out.println("합계가 500 이상이며 전체 합계는 "+hap+"입니다.");

	}

}
