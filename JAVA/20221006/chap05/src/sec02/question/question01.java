package sec02.question;

import java.util.Scanner;

public class question01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int[] array = new int[5];
		
		System.out.print("정수 5개를 차례대로 입력하세요. : ");
		for (int j = 0; j < array.length; j++) {
			array[j] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}

		System.out.println("다섯개의 정수 중 가장 큰 값은 " + max + "입니다.");


	}

}
