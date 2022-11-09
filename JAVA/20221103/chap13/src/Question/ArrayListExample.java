package Question;

import java.util.*;

class Student {
	// Student 클래스 학생이름, 주소, 전화번호 등의 필드 선언
	private String stdName;
	private String stdJuso;
	private String stdTel;

}

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		try {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println();
				System.out.println("*** 메뉴 ***");
				System.out.println("1. 학생 추가 2.학생 조회 3.학생 삭제 4.종료");
				String choose = sc.nextLine();
				switch(Integer.parseInt(choose)){
					case 1:
						System.out.print("학생의 이름과 주소, 전화번호를 입력하세요");
						String stdName = sc.nextLine();
						String stdJuso = sc.nextLine();
						String stdTel = sc.nextLine();
						list.add("이름 : "+stdName+" 주소 :"+stdJuso+" 전화번호 : "+stdTel);
						break;
					case 2:
						for(int i=0;i<list.size();i++) {
							String stu = list.get(i);
							System.out.println((i+1)+"번 학생 : " + stu);
						}
						break;
					case 3:
						System.out.print("삭제할 학생의 번호 : ");
						int num = sc.nextInt();
						sc.nextLine();
						list.remove(num-1);
						break;
					
					case 4 :
						System.exit(0);
			}		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}