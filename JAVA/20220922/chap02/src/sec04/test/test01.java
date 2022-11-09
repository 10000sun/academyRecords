package sec04.test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.141592;
		int x = 2;
		
		System.out.println("원의 반지름을 입력하세요: ");
		int r = Integer.parseInt(sc.nextLine());
		
		System.out.printf("\n반지름 %1$d 인 원 둘레는 %2$4.2f 이고 면적은 %3$4.2f 입니다.", r, x*pi*r, pi*r*r);
		

	}

}
