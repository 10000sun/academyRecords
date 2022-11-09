package sec03.question;
//문제2-1. 국어, 수학, 영어 3과목의 점수를 각각 입력받아서 총점을 출력하는 자바프로그램을 작성하여 보시오. 단, 총점은 메소드를 사용하여 풀이하시오.

import java.util.Scanner;

class Score{
	int sum(int x, int y, int z){
		return x+y+z;
	}
}
public class ex02_1 {

	public static void main(String[] args) {
		Score sco = new Score();
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 수학, 영어 3과목의 점수를 입력하세요 : ");
		/*int kor = sc.nextInt();
		int mat = sc.nextInt();
		int eng = sc.nextInt();*/
		int sum = sco.sum(sc.nextInt(), sc.nextInt(), sc.nextInt());

		System.out.println("3과목 총점은 "+sum+"점 입니다.");	
	}
}