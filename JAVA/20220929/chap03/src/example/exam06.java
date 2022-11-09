
/*문제6. 국어, 영어, 수학점수와 합계를 출력하는 자바프로그램을 작성하여 보시오.
-출력예 -
국어, 영어, 수학 점수를 차례대로 입력하세요 : 85 95 70
국어 : 85점, 영어 : 95점, 수학 : 70점
세 과목의 합계는 250점이고 평균은 83.3333점입니다.*/

package example;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 차례대로 입력하세요.");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		
		int result1 = score1+score2+score3;
		double result2 = (double) result1/3;
				
		System.out.printf("세 과목의 합계는 %1$d 점이고 평균은 %2$2.2f 점입니다.", result1, result2);

	}

}
