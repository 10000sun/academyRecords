package example;

import java.util.Scanner;

class method{
	void menu(int a, int b, int c){
		boolean stop = true;
		int hap = a+b+c;
		int avg = hap/3;
		Scanner sc = new Scanner(System.in);
		System.out.println("===메뉴===");
		
		while(stop) {
			System.out.println("(1)총점 계산 (2)평균 계산 (3)합격 여부 (4)종료");
			int num = sc.nextInt();
			switch(num){
			case 1:
				System.out.println("세 과목의 총점은 "+hap+"입니다.");
				break;
			case 2:
				System.out.println("세 과목의 평균은 "+avg+"입니다.");
				break;
			case 3:
				if(a<40 || b<40 || c<40 || avg <60) {
					System.out.println("불합격입니다.");
				} else {
					System.out.println("합격입니다.");
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
}

public class exProgram01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		method met = new method();
		
		System.out.println("전기, 전자, 프로그래밍 3과목의 성적을 입력하세요. : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		met.menu(a, b, c);

	}

}
