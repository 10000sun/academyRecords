
/*문제3-2. 문제3-1에서 부피를 계산하는 기능을 상속을 이용하여 자식클래스를 출력하는 자바프로그램을 작성하시오. 단, 구의 부피는 (4/3)*π*r^3임.
- 출력예 -
반지름을 입력하세요 : 5
원의 둘레는 00이고 면적은 000입니다.
구의 반지름은 5이며 부피는 523.333입니다.*/

package sec03.question;

import java.util.Scanner;

class Volume extends Area{
	double volume(double ar) {
		return ar;
	}
}

public class ex03_2 {
	public static void main(String[] args) {
		final double PI = 3.141592;
		Scanner sc = new Scanner(System.in);
		Circum circum = new Circum();
		Area area = new Area();
		Volume Ar = new Volume();
		
		System.out.println("반지름을 입력하세요. : ");
		int radius = sc.nextInt();
		
		double Area = area.ar(PI, radius);
		double Circul = circum.cir(2 , PI, radius);
		double Volume = Ar.volume(Area)*radius*4/3;
		
		System.out.println("원의 둘레는 "+Circul+"이고 면적은 "+Area+"입니다.");
		System.out.println("구의 반지름은 "+radius+"이며 부피는 "+Volume+"입니다.");
	}
}
