
/*문제6. 아래 출력예와 같이 난수 생성 함수를 이용하여 컴퓨터로 여러가지 시뮬레이션하는 것을 흔히 몬테까를로(Monte Carlo) 시뮬레이션이라고 한다. 
그렇다면 컴퓨터가 동전을 던지고 사용자는 앞면, 뒷면을 맞추는 자바프로그램을 작성하시오. 
- 출력예 -
*************************************
*    동전 앞면/뒷면 맞추기 게임    *  
*************************************
동전의 앞면=1, 뒷면=2, 종료=-1 입력 : 1
컴퓨터 : 앞면 / 사용자 : 앞면 --> 1승 0패
----------------------------------------------
동전의 앞면=1, 뒷면=2, 종료=-1 입력 : 2
컴퓨터 : 앞면 / 사용자 : 뒷면 --> 1승 1패
----------------------------------------------
동전의 앞면=1,뒷면=2, 종료=-1 입력 : -1
게임종료 (전체 1승 1패)*/

package sec02.question;

import java.util.Scanner;

public class question06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int result = 0;
		int wincount = 0;
		int losecount = 0;
		
		System.out.println("*************************************");
		System.out.println("*         동전 앞면/뒷면 맞추기 게임       *");
		System.out.println("*************************************");
		while (run) {
			System.out.println("동전의 앞면 = 1, 뒷면 = 2, 종료 = -1 입력 : ");
			result = sc.nextInt();
			int penny = (int) (Math.random() * 2) + 1;
			if (result == 1) {
				if (penny == result) {
					wincount++;
					System.out.println("컴퓨터 : 앞면 / 사용자 : 앞면 -->"+wincount+"승 "+losecount+"패");
				} else if (penny != result) {
					losecount++;
					System.out.println("컴퓨터 : 앞면 / 사용자 : 뒷면 -->"+wincount+"승 "+losecount+"패");
				}
			} else if (result == 2) {
				if (penny == result) {
					wincount++;
					System.out.println("컴퓨터 : 뒷면 / 사용자 : 뒷면 -->"+wincount+"승 "+losecount+"패");
				} else if (penny != result) {
					losecount++;
					System.out.println("컴퓨터 : 뒷면 / 사용자 : 앞면 -->"+wincount+"승 "+losecount+"패");
				}
			} else if (result == -1) {
				System.out.println("게임 종료 (전체 "+wincount+"승 "+losecount+"패)");
				run = false;
			}

		}

	}

}
