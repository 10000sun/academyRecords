package sec03.question;
//문제2-2. 문제2-1에서 평균 기능을 상속을 이용하여 자식클래스를 출력하는 자바프로그램을 작성하여 보시오.

import java.util.Scanner;

class avg extends Score{
	double avg(int sum) {
		return (double)sum/3;
	}
}

public class ex02_2 {
	public static void main(String[] args) {
		avg sco = new avg();
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 수학, 영어 3과목의 점수를 입력하세요 : ");
		
		int sum = sco.sum(sc.nextInt(), sc.nextInt(), sc.nextInt());
		double avg = sco.avg(sum);
		System.out.println("3과목 총점은 "+sum+"점 이고 평균은 "+avg+"입니다.");
	}
}