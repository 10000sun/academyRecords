package sec02.exam01;

import java.util.Scanner;

public class ArrayCreateByValueListExample1_1 {

	public static void main(String[] args) {
		final int NUM = 3;
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[NUM];
		// int[] scores;
		// scores = new int[] { 83, 90, 85 }; 불가능 

		for (int j = 0; j < NUM; j++) {
			System.out.println((j + 1) + "번 학생의 점수를 입력하세요. : ");
			// scores[j] = sc.nextInt();
			scores[j] = Integer.parseInt(sc.nextLine());

		}

		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		int sum = 0;
		for (int i = 0; i < NUM; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / NUM;
		System.out.println("평균 : " + avg);

	}

}
