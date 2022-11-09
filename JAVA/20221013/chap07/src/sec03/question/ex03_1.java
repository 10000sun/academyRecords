
/*문제3-1. 반지름을 입력받아서 원의 둘레와 면적을 계산하는 자바프로그램을 작성하시오. 
 * 단, 원주율은 3.141592로 상수처리하며 원의 둘레와 면적은 메소드를 사용하여 풀이하시오.
- 출력예 -
반지름을 입력하세요 : 10
원의 둘레는 62.83이고 면적은 314.16입니다.*/

package sec03.question;

import java.util.Scanner;

class Circum {
	double cir(int x, double y, int z){
		return x*y*z;
	}
}
class Area{
	double ar(double x, int y) {
	return x*y*y;
	}
}

public class ex03_1 {
	public static void main(String[] args) {
		final double PI = 3.141592;
		Scanner sc = new Scanner(System.in);
		Circum circum = new Circum();
		Area area = new Area();
		System.out.println("반지름을 입력하세요. : ");
		int radius = sc.nextInt();
		double Area = area.ar(PI, radius);
		double Circul = circum.cir(2 , PI, radius);
		System.out.println("원의 둘레는 "+Circul+"이고 면적은 "+Area+"입니다.");
	}
}