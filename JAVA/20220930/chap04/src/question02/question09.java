
/*문제9. 오옴의 법칙(v=ir)을 활용하여 각각의 값을 입력하면 전압, 전류, 저항을 계산하여 출력하는 자바프로그램을 작성하여 보시오.
- 출력예 -
(1) 전압계산 (2) 전류계산 (3) 저항계산 (4) 종료
1
전류(암페어)를 입력하세요 : 10
저항(오옴)을 입력하세요 : 5
전압을 계산하면 50(볼트)입니다.*/

package question02;

import java.util.Scanner;

public class question09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("(1)전압계산 (2)전류계산 (3)저항계산 (4)종료");
		int choose = sc.nextInt();
		
		switch(choose) {
			case 1:
				System.out.println("전류(암페어)를 입력하세요.");
				int var1 = sc.nextInt();
				
				System.out.println("저항(옴)을 입력하세요.");
				int var2 = sc.nextInt();
				
				System.out.println("전압을 계산하면"+var1*var2+"볼트입니다.");
				break;
			case 2:
				System.out.println("전압(볼트)을 입력하세요.");
				int var3 = sc.nextInt();
				
				System.out.println("저항(옴)을 입력하세요.");
				int var4 = sc.nextInt();
				
				System.out.println("전류를 계산하면 "+var3/var4+"암페어 입니다.");
				break;
			case 3:
				System.out.println("전압(볼트)을 입력하세요.");
				int var5 = sc.nextInt();
				
				System.out.println("전류(암페어)를 입력하세요.");
				int var6 = sc.nextInt();
				
				System.out.println("저항을 계산하면 "+var5/var6+"옴 입니다.");
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				break;
		}

	}

}
