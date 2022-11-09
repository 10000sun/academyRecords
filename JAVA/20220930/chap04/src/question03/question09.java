
/*문제9. B감귤농장에서 재배하는 감귤을 등급별로 나누어 분류하는 자바프로그램을 작성하여 보시오. 
 * 단, 등급은 크기별로 A, B, C로 나뉘며 어느 등급이더라도 10개가 되면 무한반복문을 종료시킨다.
- 출력예 -
감귤의 크기를 입력하세요 (A, B, C) : A
현재 A등급의 감귤은 1개입니다.
감귤의 크기를 입력하세요 (A, B, C) : C
현재 C등급의 감귤은 1개입니다.
...*/

package question03;

import java.util.Scanner;

public class question09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gradeA = 0;
		int gradeB = 0;
		int gradeC = 0;
		
		while(true) {
			System.out.println("감귤의 크기를 입력하세요 (A, B, C) : ");
			String choose = sc.nextLine();
			if(choose.equals("A") || choose.equals("a")) {
				gradeA += 1;
				System.out.println("현재 A등급의 감귤은 "+gradeA+"개 입니다.");
			} else if(choose.equals("B") || choose.equals("b")) {
				gradeB += 1;
				System.out.println("현재 B등급의 감귤은 "+gradeB+"개 입니다.");
			} else if(choose.equals("C") || choose.equals("c")) {
				gradeC += 1;
				System.out.println("현재 A등급의 감귤은 "+gradeC+"개 입니다.");
			} else {
				System.out.println("잘못 선택하셨습니다.");
			}
			if(gradeA>=10 || gradeB>=10 ||gradeC>=10) {
				break;
			}
		}System.out.println("감귤 반복문을 중지합니다. 현재 감귤 갯수는 각각"+gradeA+"개, "+gradeB+"개, "+gradeC+"개 입니다.");

	}

}
