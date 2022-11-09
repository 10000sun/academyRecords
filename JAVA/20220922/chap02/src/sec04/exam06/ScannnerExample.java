package sec04.exam06;

import java.util.Scanner;

public class ScannnerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요: ");
		String name = sc.nextLine(); //문자열 입력
		
		System.out.println("키(cm)를 입력하세요: ");
		int height = Integer.parseInt(sc.nextLine()); //정수 입력
		
		System.out.println("몸무게(kg)를 입력하세요: ");
		int weight = Integer.parseInt(sc.nextLine());
		
		System.out.println(name); //출력
		System.out.println(height);
		System.out.println(weight);
	}

}
