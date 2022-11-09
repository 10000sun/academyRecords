
/*문제6. for 반복문을 사용하여 3명의 점수를 입력받아 총점과 평균을 구하는 자바프로그램을 작성하여 보시오.
- 출력예 -
1번 학생의 점수를 입력하세요 : 60
2번 학생의 점수를 입력하세요 : 70
3번 학생의 점수를 입력하세요 : 80
3명의 점수 합계는 210점이고 평균은 70.00점입니다.*/

package question03;

import java.util.Scanner;

public class question06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번 학생의 점수를 입력하세요. : ");
		int std1 = sc.nextInt();
		System.out.println("2번 학생의 점수를 입력하세요. : ");
		int std2 = sc.nextInt();
		System.out.println("3번 학생의 점수를 입력하세요. : ");
		int std3 = sc.nextInt();
		
		int result1 = std1+std2+std3;
		double result2 = result1/3.0;
		
		System.out.println("3명의 점수 합계는 "+result1+"점이고 평균은 "+result2+"점 입니다.");

	}

}
