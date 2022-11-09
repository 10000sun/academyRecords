package phonebook01;

import java.io.IOException;

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

class PhoneBookVer01 {

	public static void main(String[] args) {
		PhoneInfo pInfo1 = new PhoneInfo("이정훈", "323-1111", "92.09.12");
		PhoneInfo pInfo2 = new PhoneInfo("김효준", "323-2222");
		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();

		pause();
	}

	private static void pause() {
		try {
			System.in.read();
		} catch (IOException e) {

		}
	}

}
