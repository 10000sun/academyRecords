
/*문제12. 저항값을 2개 입력받아 각각 직렬과 병렬로 연결했을 때 값을 출력예와 같이 출력하는 자바프로그램을 작성하시오.
- 출력예 -
저항값을 2개 입력하세요 : 10 10
저항을 직렬로 연결하면 20(옴)이고 병렬로 연결하면 5(옴)입니다.*/

package example;

import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("저항값을 2개 입력하세요.: ");
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		
		int result1 = var1+var2;
		int result2 = (var1*var2)/(var1+var2);
		
		System.out.println("저항을 직렬로 연결하면 "+result1+"옴이고 병렬로 연결하면 "+result2+"옴 입니다.");

	}

}
