
/*문제5. 아래 출력예와 같이 자바프로그램을 작성하여 보시오. 
 * 단, 합격여부는 기존 클래스를 상속하여 작성하시오. 
 * 합격여부는 3과목 중 한 과목이라도 40점 미만이거나 평균점수가 60점 미만이면 불합격으로 출력하며 그 외에는 합격으로 출력하시오.
- 출력예 -
데이터베이스, 디지털논리회로, 프로그래밍 3과목의 성적을 입력하세요 : 90 100 30
=== 메뉴 ===
(1) 총점계산 (2) 평균계산 (3) 합격여부*/

package sec03.question;

import java.util.Scanner;

class ex05exam01 {
	int sum(int x, int y, int z) {
		return x + y + z;
	}

	double avg(int sum) {
		return sum / 3.0;
	}

	void menu() {
		System.out.println("=== 메뉴 ===");
		System.out.println("(1)총점 계산 (2)평균 계산 (3)합격 여부");
	}
}

class ex05exam02 extends ex05exam01 {
	void ex05exam(int x, int y, int z, double avg) {
		if (x < 40 || y < 40 || z < 40 || avg < 60) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("합격입니다.");
		}
	}
}

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex05exam02 ex02 = new ex05exam02();

		System.out.println("데이터베이스, 디지털논리회로, 프로그래밍 3과목의 성적을 입력하세요 : ");
		int db = sc.nextInt();
		int dl = sc.nextInt();
		int pr = sc.nextInt();
		
		int sum = ex02.sum(db, dl, pr);
		double avg = ex02.avg(sum);
		ex02.menu();
				
				
		int i = sc.nextInt();

		switch (i) {
		case 1:
			System.out.println("세 과목의 총점은 " + sum + "입니다.");
			break;
		case 2:
			System.out.println("세 과목의 평균은 " + avg + "입니다.");
			break;
		case 3:
			ex02.ex05exam(db, dl, pr, avg);
			break;
		}
	}
}
