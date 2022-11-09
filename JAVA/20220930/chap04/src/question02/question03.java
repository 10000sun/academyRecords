
/*문제3. 국어, 영어, 수학 점수를 입력받아 평균점수가 60점 이상이면 "합격", 60점 미만이면 "불합격"이라고 출력하는 자바프로그램을 작성하시오.*/

package question02;

import java.util.Scanner;

public class question03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 차례대로 입력해주세요.");
		
		int kor = sc.nextInt();
		int mat = sc.nextInt();
		int eng = sc.nextInt();
		
		int result = (kor+mat+eng)/3;
		
		if(result >=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
	}

}
