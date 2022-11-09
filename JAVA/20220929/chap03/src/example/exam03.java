
/*문제3. 오옴의 법칙(V=IR)을 활용하여 출력예와 같이 전류와 저항을 입력하면 전압을 계산하는 자바프로그램을 작성하시오.
- 출력예 -
전류값를 입력하세요.
5.0
저항값을 입력하세요.
100.0
전류는 5.0암페어이고 저항은 100.0옴이라면 전압은 500.0볼트입니다.
*/

package example;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전류값을 입력하세요.: ");
		double elec1 = sc.nextDouble();
		
		System.out.println("저항값을 입력하세요.: ");
		double ohm2 = sc.nextDouble();
		
		System.out.println("전류는 "+elec1+" 암페어 이고 저항은 "+ohm2+" 옴이라면 전압은 "+elec1*ohm2+"볼트 입니다.");

	}

}
