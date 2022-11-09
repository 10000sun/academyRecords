
/*문제4. for 반복문을 사용하여 1부터 10까지 짝수의 곱을 출력하는 자바프로그램을 작성하여 보시오.
- 출력예 -
1부터 10까지 짝수의 곱은 3840입니다.*/

package question03;

public class question04 {

	public static void main(String[] args) {
		int sum = 1;
		int i = 0;
		for (i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			sum *= i;

		}

		System.out.println("1부터 10까지의 짝수의 곱은 " + sum + "입니다.");

	}

}
