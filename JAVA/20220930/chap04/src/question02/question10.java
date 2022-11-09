
/*문제10. switch문을 사용하여 사용자로부터 하나의 문자를 입력받아서 문자가 'R' 또는 'r'이면 사각형의 면적을 계산하고 'C' 또는 'c'이면 원의 면적을 'T' 또는 't'는 삼각형의 면적을 계산하여 출력하는 자바프로그램을 작성하여 보시오. 단, 원주율은 3.141592를 사용하며 상수 처리하시오.
- 출력예 -
사각형(R), 원(C), 삼각형(T) 중 하나를 선택하세요 : T(C/R)
밑변의 길이(반지름/가로 길이)를 입력하세요 : 10 
높이(세로 길이)를 입력하세요 : 10
구하고자 하는 삼각형(원/사각형)의 면적은 50.00(314.16/100)입니다.*/

package question02;

import java.util.Scanner;

public class question10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사각형(R), 원(C), 삼각형(T) 중 하나를 선택하세요 : ");
		char choose = sc.next().charAt(0);
		
		switch(choose) {
			case 'R':
			case 'r':
				System.out.println("가로길이를 입력하세요: ");
				double r1 = sc.nextDouble();
				
				System.out.println("세로길이를 입력하세요: ");
				double r2 = sc.nextDouble();
				
				System.out.println("구하고자 하는 사각형의 면적은 "+r1*r2+"입니다.");
				break;
				
			case 'C':
			case 'c':
				System.out.println("반지름을 입력하세요: ");
				double c1 = sc.nextDouble();
				
				double c2 = 3.14;
				
				System.out.println("구하고자 하는 원의 면적은 "+c2*Math.pow(c1, 2)+"입니다.");
				break;
			
			case 'T':
			case 't':
				System.out.println("밑변의 길이를 입력하세요: ");
				double t1 = sc.nextDouble();
				
				System.out.println("높이를 입력하세요: ");
				double t2 = sc.nextDouble();
				
				System.out.println("구하고자 하는 삼각형의 면적은 "+t1*t2/2+"입니다.");
				break;
		}
	}

}
