
/*문제7. 아래 출력예와 같이 숫자 맞추기 게임 자바프로그램을 작성하시오. 단, 1~100까지의 난수를 사용하되
 난수는 출력하지 않고 메시지만 보고 무한반복시켜 정답을 맞추시오.
- 출력예 -
***********************
*  숫자 맞추기 게임  *
***********************
1부터 100까지 사이의 숫자를 입력하세요 : 50
입력한 정수는 50이며 정답보다 작은 수입니다. 
1부터 100까지 사이의 숫자를 입력하세요 : 80
입력한 정수는 80이며 정답보다 큰 수입니다.
1부터 100까지 사이의 숫자를 입력하세요 : 70

축하합니다! 입력한 정수는 70이며 정답입니다!*/

package sec02.question;

import java.util.Scanner;

public class question07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int quiz = 0;
		int anwser = 0;
		int count = 7;

		System.out.println("********************");
		System.out.println("*   숫자 맞추기 게임    *");
		System.out.println("********************");
		quiz = (int) (Math.random() * 100) + 1;

		while (run) {
			System.out.println("1부터 100까지 사이의 숫자를 입력하세요. : ");
			anwser = sc.nextInt();
			if (quiz == anwser) {
				System.out.println("축하합니다! 입력한 정수는 " + anwser + "이며 정답입니다! (남은 횟수 = "+(count-1)+")");
				run = false;
			} else if (quiz > anwser) {
				System.out.println("입력한 정수는 " + anwser + "이며 정답보다 작은 수 입니다.(남은 횟수 = "+(count-1)+")");
				count--;
				if (count == 0) {
					System.out.println("기회를 모두 소진하셨습니다. (정답 = "+quiz+")");
					run = false;
				}
			} else if (quiz < anwser) {
				System.out.println("입력한 정수는 " + anwser + "이며 정답보다 큰 수 입니다.(남은 횟수 = "+(count-1)+")");
				count--;
				if (count == 0) {
					System.out.println("기회를 모두 소진하셨습니다. (정답 = "+quiz+")");
					run = false;
				}
			}
		}

	}

}
