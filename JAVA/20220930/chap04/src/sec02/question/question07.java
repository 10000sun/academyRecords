package sec02.question;

import java.util.Scanner;

public class question07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			int choose = sc.nextInt();
			if(choose == 1) {
				System.out.println("예금액>");
				balance += sc.nextInt();
			} else if(choose == 2) {
				System.out.println("출금액>");
				balance -= sc.nextInt();
			} else if(choose == 3) {
				System.out.println("잔고>"+balance);
			} else if(choose == 4) {
				break;
			} else {
				System.out.println("잘못 선택하셨습니다.");
			}
		} System.out.println("프로그램 종료");

	}

}
