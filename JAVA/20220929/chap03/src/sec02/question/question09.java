package sec02.question;

import java.util.Scanner;

public class question09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요.: ");
		double var1 = Double.parseDouble(sc.nextLine());
		//double var1 = sc.nextDouble();

		System.out.println("두번째 수를 입력하세요.:  ");
		double var2 = Double.parseDouble(sc.nextLine());
		//double var1 = sc.nextDouble();

		System.out.println("첫번째 수: " + var1);
		System.out.println("두번째 수: " + var2);
		System.out.println("------------------");
		if(var2 != 0.0) {
			System.out.println("결과: " + (var1/var2));
		} else {
			System.out.println("결과: 무한대");
		}

	}

}
