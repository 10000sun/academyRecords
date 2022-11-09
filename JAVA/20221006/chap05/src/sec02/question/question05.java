
//문제5. 학생 3명의 10개 문항의 시험답안지로부터 채점을 한 후 결과를 다음과 같이 출력하는 자바프로그램을 작성하여 보시오. 
//단, 2차원 배열을 이용하여 풀이하며 시험의 정답은 int answer[]={1,3,2,3,4,2,3,1,3,2}과 같이 1차원 배열에 저장함. 
//- 출력예 -
//1번 학생의 답안 입력 : 1 3 3 3 1 2 3 1 3 2
//2번 학생의 답안 입력 : 4 3 3 3 2 2 3 1 3 2
//3번 학생의 답안 입력 : 1 3 1 3 1 2 3 4 3 4
//=== 시험 채점 결과 ===
//문  항 1번 2번 3번 4번 5번 6번 7번 8번 9번 10번 점수
//학생1  O   O    X    O   X   O   O    O    O    O   80점
//학생2  X   O    X    O   X   O   O    O    O    O    70점
//학생3  O   O    X    O   X   O   O    X    O    X    60점

package sec02.question;

import java.util.Scanner;

public class question05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] student = new int[3][11];
		int[] answer = { 1, 3, 2, 3, 4, 2, 3, 1, 3, 2 };
		
		for (int i = 0; i < student.length; i++) {
			System.out.println("학생"+(i+1)+" 의 답안을 입력하세요.");
			for (int j = 0; j < student[i].length-1; j++) {
				student[i][j] = sc.nextInt();
				if (student[i][j] == answer[j]) {
					student[i][10] += 10;
				}
			}
		}
		System.out.println("===시험 채점 결과===");
		System.out.println("문 항 1번 2번 3번 4번 5번 6번 7번 8번 9번 10번 총점");
		for (int i = 0; i < student.length; i++) {
			System.out.print("학생"+(i+1)+"");
			for (int j = 0; j < student[i].length-1; j++) {
				if (student[i][j] == answer[j]) {
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
			}		System.out.println(student[i][10]);
		}

	}

}
