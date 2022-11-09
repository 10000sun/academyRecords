
/*문제11. switch문을 사용하여 아래 출력예와 같이 자바프로그램을 작성하여 보시오. 
 * 단, 합격여부는 3과목 중 한 과목이라도 40점 미만이거나 평균점수가 60점 미만이면 불합격으로 출력하며 그 외에는 합격으로 출력하시오.
- 출력예 -
전기, 전자, 프로그래밍 3과목의 성적을 입력하세요 : 90 100 30
=== 메뉴 ===
(1) 총점계산 (2) 평균계산 (3) 합격여부 (4) 종료*/

package question02;

import java.util.Scanner;

public class question11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전기, 전자, 프로그래밍 3과목의 성적을 차례대로 입력해주세요.");
		
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		int var3 = sc.nextInt();
		
		System.out.println("메뉴를 선택하세요 (1)총점 계산 (2)평균 계산 (3)합격 여부 (4)종료");
		int num = sc.nextInt();
		
		int result1 = (var1+var2+var3);
		int result2 = (var1+var2+var3)/3;
		
		switch(num) {
			case 1:
				System.out.println("전기, 전자, 프로그래밍의 총점은 "+result1+ "입니다.");
				break;
				
			case 2:
				System.out.println("전기, 전자, 프로그래밍의 평균은 "+result2+ "입니다.");
				break;
				
			case 3:
				if(var1 < 40 || var2 < 40 || var3 < 40 || result2 <60) {
					System.out.println("불합격");
				} else {
					System.out.println("합격");
				}
				break;
				
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
		}
		
	}
}

