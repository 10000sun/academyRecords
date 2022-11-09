
/*문제7. 사용자로부터 영문 소문자를 무한반복 입력받아서 영문 대문자로 바꾸는 자바프로그램을 작성하여 보시오. 
 * 단, 사용자가 영문 소문자 'q'를 입력하면 반복문을 종료(break)하시오.*/

package question03;

import java.io.IOException;

public class question07 {

	public static void main(String[] args) throws Exception {
		while (true) {
			System.out.print("영문 소문자를 입력하세요 :");
			int ch1 = System.in.read();
			int ch2 = ch1 - 32;

			char ch3 = (char) ch1;
			char ch4 = (char) ch2;

			System.in.read();
			System.in.read();

			if (ch3 == 'q')
				break;

			System.out.println("입력하신 문자는 " + ch3 + "이며 대문자로 변환하면 " + ch4 + "입니다.");
		}
	}
}