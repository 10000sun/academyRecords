
/*문제8. 1인치는 2.54센티미터이다. 키를 입력받아서 인치로 변환하는 자바프로그램을 작성하시오.
- 출력예-
키(cm)를 입력하세요 : 180
키 180센티미터를 인치로 변환하면 70.87인치입니다.*/

package example;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키(cm)를 입력하세요.: ");
		int var1 = sc.nextInt();
		double result = (double) var1 / 2.54;

		System.out.println("키 " + var1 + "센티미터를 인치로 변환하면 "+result+"인치 입니다.");

	}

}
