package exam;

import java.util.Scanner;

class CircleRadius implements CircleTest {

	@Override
	public double circumstance(double r) {
		return 2*PI*r;
	}

	@Override
	public double area(double r) {
		return PI*r*r;
	}
	
}

public class CircleExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircleRadius cr = new CircleRadius();
		
		System.out.println("원의 반지름을 입력하세요 : ");
		
		double r = sc.nextDouble();
		
		System.out.println("원의 둘레는 "+cr.circumstance(r)+"이며 원의 면적은 "+cr.area(r)+"입니다.");
		//원의 반지름을 입력하세요 : 5.0
		//원의 둘레는 31.40이며 원의 면적은 78.50입니다.
		
	}
}
