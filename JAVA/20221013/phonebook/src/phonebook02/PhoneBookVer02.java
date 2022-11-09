package phonebook02;

import java.util.Scanner;

class PhoneInfo {
	String name; // 필드
	String phoneNumber;
	String birth;

	public PhoneInfo(String name, String num, String birth) { // 생성자
		this.name = name;
		phoneNumber = num;
		this.birth = birth;
	}

	public PhoneInfo(String name, String num) { // 생성자
		this.name = name;
		phoneNumber = num;
		this.birth = null;
	}

	public void showPhoneInfo() { // 메소드
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
		if (birth != null)
			System.out.println("birth : " + birth);

		System.out.println(""); // 데이터 구분
	}
}

public class PhoneBookVer02 {

	static Scanner keyboard = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("선택 하세요.");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.println("선택: ");
	}

	public static void readData() {
		System.out.println("이름 : ");
		String name = keyboard.nextLine();
		System.out.println("전화번호 : ");
		String phone = keyboard.nextLine();
		System.out.println("생년월일");
		String birth = keyboard.nextLine();

		PhoneInfo info = new PhoneInfo(name, phone, birth);
		System.out.println("\n 입력된 정보 출력");
		info.showPhoneInfo();
	}

	public static void main(String[] args) {
		
		int choice;
		
		while(true) {
			showMenu();
			choice = keyboard.nextInt();
			keyboard.nextLine();
			switch(choice) {
			case 1:
				readData();
				break;
				
			case 2:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}

