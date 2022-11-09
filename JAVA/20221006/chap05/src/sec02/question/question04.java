
//문제4. 2차원 배열을 이용하여 학생 3명의 4과목 성적을 차례대로 입력받아서 각각의 학생의 
//총점과 평균을 출력하는 자바프로그램을 작성하시오.
//- 출력예 -
//1번 학생의 4과목 성적을 차례대로 입력하세요 : 60 70 80 90
//2번 학생의 4과목 성적을 차례대로 입력하세요 : 100 80 60 70
//3번 학생의 4과목 성적을 차례대로 입력하세요 : 90 80 50 40

package sec02.question;

import java.util.Scanner;

public class question04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[3][5];

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j <scores[i].length-1;j++) {
				System.out.println((i + 1) + "번 학생의 4과목 성적을 차례대로 입력하세요 : ");
				scores[i][j] = sc.nextInt();
				scores[i][4] += scores[i][j];
				
				
			}
			System.out.println((i+1)+"번 학생의 총점 : "+scores[i][4]);
			System.out.println((i+1)+"번 학생의 평균 : "+(double)(scores[i][4])/4.0);
		}
		
		
		
	}

}
