package sec04.test;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("졸업자 수를 입력하세요. : ");
		int gradnum = Integer.parseInt(sc.nextLine());
		
		System.out.println("취업자 수를 입력하세요. : ");
		int getjob = Integer.parseInt(sc.nextLine());
		
		double result = (double) getjob / (double) gradnum * 100;
		System.out.printf("K대학 졸업생의 취업률은 %1$4.2f%%입니다.", result);

	}

}
