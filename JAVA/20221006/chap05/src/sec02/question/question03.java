package sec02.question;

import java.util.Scanner;

public class question03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int students[];
		students = new int[5];
		int min = 1000;
		int max = 0;
		int sum = 0;
		

		System.out.println("다섯명의 성적을 차례대로 입력하세요. : ");

		for (int i = 0; i < students.length; i++) {
			students[i] = sc.nextInt();
			sum += students[i];
			if (min > students[i]) {
				min = students[i];
			}
			if (max < students[i]) {
				max = students[i];
			}
			
		}
		int result = sum/5;

		System.out.println("다섯명의 평균 점수 : " + result + "/ 최고점수 : " + max + " / 최저점수 : " + min);
		System.out.println(students[0]);

	}
}
