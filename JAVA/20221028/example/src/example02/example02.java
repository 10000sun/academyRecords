package example02;

import java.util.Scanner;

public class example02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double PI = 3.14159;
		
		System.out.println("원기둥의 반지름을 입력하세요.");
		double r = sc.nextDouble();
		System.out.println("원기둥의 높이를 입력하세요.");
		double h = sc.nextDouble();
		double result = PI*Math.pow(r, 2)*h;
		
		System.out.println("원기둥의 부피는 "+result+"입니다.");

	}

}
