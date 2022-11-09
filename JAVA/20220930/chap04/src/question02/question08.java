
/*문제8. 국어, 영어, 수학 3과목의 점수를 입력받아 아래 출력예와 같이 출력하는 자바프로그램을 작성하시오.
- 출력예 -
국어, 영어, 수학 점수를 차례대로 입력하세요 : 70 70 70
메뉴를 선택하세요 (1=총점, 2=평균, 3=종료) : 1(2)
국어, 영어, 수학 점수의 총점(평균)은 210(70.00)점입니다.*/

package question02;

import java.util.Scanner;

public class question08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 차례대로 입력해주세요.");
		
		int kor = sc.nextInt();
		int mat = sc.nextInt();
		int eng = sc.nextInt();
		
		System.out.println("메뉴를 선택하세요 (1=총점, 2=평균, 3=종료)");
		
		int num = sc.nextInt();
		
		int result1 = (kor+mat+eng);
		int result2 = (kor+mat+eng)/3;
		
		if(num == 1) {
			System.out.println("국어, 영어, 수학 점수의 총점은 "+result1+ "입니다.");
		} else if(num == 2){
			System.out.println("국어, 영어, 수학 점수의 평균은 "+result2+ "입니다.");
		} else {
			System.out.println("프로그램을 종료합니다.");
		}
		
	}

}
