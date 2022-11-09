package sec04.test;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2개의 값을 입력하세요. : ");
		double num1 = Double.parseDouble(sc.nextLine());
		double num2 = Double.parseDouble(sc.nextLine());
		
		double a = (double)(num1+num2);
		double b = (double)(num1-num2);
		double c = (double)(num1*num2);
		double d = (double)(num1/num2);
		
		System.out.printf("덧셈 : %1$3.2f \n뺄셈 : %2$3.2f \n곱셈 : %3$3.2f \n나눗셈 : %4$3.2f", a, b, c, d);

	}

}
