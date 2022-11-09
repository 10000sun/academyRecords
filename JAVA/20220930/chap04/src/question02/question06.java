
/*문제6. 몸무게와 키를 입력받아 신체질량지수(BMI)를 구하는 자바프로그램을 작성하여 보시오. 
 * 단, bmi = 몸무게(kg)/키(m)의 제곱이며 bmi가 20.0 이상이고 25.0 미만이면 "표준체중입니다.", 그 외에는 "체중관리가 필요합니다."라고 출력함.
- 출력예 -
이름을 입력하세요 : 홍길동
몸무게를 입력하세요 (kg) : 45(70)
키를 입력하세요 (m) : 1.68(1.75)
홍길동님의 bmi는 15.9(22.9)이며 체중관리가 필요합니다(표준체중입니다).*/

package question02;

import java.util.Scanner;

public class question06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름과 몸무게(kg), 키(m)를 차례대로 입력하세요.");
		
		String name = sc.nextLine();
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		
		double result = weight/Math.pow(height, 2);
		
		if(result >= 20 && result < 25) {
			System.out.println(name+"님의 bmi는 "+result+" 이며 표준체중입니다.");
		} else {
			System.out.println(name+"님의 bmi는 "+result+" 이며 체중관리가 필요합니다.");
		}

	}

}
