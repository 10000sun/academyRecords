package sec02.question;

import java.util.Scanner;

public class question02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double min = 100.0;
		double[] array = new double[5];
		
		System.out.print("실수 5개를 차례대로 입력하세요. : ");
		for (int j = 0; j < array.length; j++) {
			array[j] = sc.nextDouble();
		}
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}

		System.out.println("다섯개의 실수 중 가장 작은 값은 " + min + "입니다.");


	}


}
