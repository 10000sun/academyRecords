package sec02.verify.exam06;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				studentNum = sc.nextInt();
				System.out.println("학생수> " + studentNum);
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					scores[i] = sc.nextInt();
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores[i]; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					if (max > scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수 : " + max);

				for (int i = 0; i < scores[i]; i++) {
					sum += scores[i];
				}
				System.out.println("평균 점수 : " + (sum / studentNum));
			} else if (selectNo == 5) {
				run = false;
			}
			

		}
		System.out.println("프로그램 종료");

	}

}
