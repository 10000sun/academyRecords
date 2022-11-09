
/*문제10.  A제조업체에서 양품과 불량품을 판별하는 자바프로그램을 작성하여 보시오. 
 * 단, 완성품의 무게가 500g~800g 사이만 양품이며 이 외에는 불량품으로 판정한다. 양품이 20개가 되면 1박스가 되며 무한반복문을 종료시킨다. 
- 출력예 -
완성품의 무게를 입력하세요 (단위 : g) : 600
이 제품은 양품이며 현재 1개입니다.
완성품의 무게를 입력하세요 (단위 : g) : 400
이 제품은 불량품이며 현재 1개입니다.
...
완성품의 무게를 입력하세요 (단위 : g) : 700
양품이 20개가 되어 1박스가 되었습니다.*/

package question03;

import java.util.Scanner;

public class question10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int good = 0;
		int bad = 0;

		while (true) {
			System.out.println("완성품의 무게를 입력하세요 (단위 : g) : ");
			int choose = sc.nextInt();
			if (choose >= 500 && choose <= 800) {
				good += 1;
				System.out.println("이 제품은 양품이며 현재 " + good + "개 입니다.");
			} else {
				bad += 1;
				System.out.println("이 제품은 불량품이며 현재 " + bad + "개 입니다.");
			}
			if (good >= 20) {
				break;
			}
		}
		System.out.println("양품 20개가 1박스가 되어 반복문을 중지합니다. 현재 불량품은 " + bad + "개 입니다.");

	}

}
