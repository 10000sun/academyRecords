package sec04.questions;

import java.util.Scanner;

public class question03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("[필수 정보 입력]");
		System.out.println("\n1. 이름 : ");
		String name = sc.nextLine();
		System.out.println("2. 주민번호 앞 6자리 : ");
		int birth = Integer.parseInt(sc.nextLine());
		System.out.println("3. 전화번호 : ");
		String tel = sc.nextLine();
		
		System.out.println(name);
		System.out.printf("\n%06d", birth);
		System.out.println(tel);

	}

}
