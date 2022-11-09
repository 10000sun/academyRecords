
/*문제3. for 반복문을 사용하여 아래 출력예와 같이 자바프로그램을 작성하여 보시오.
- 출력예 -
1부터 10까지의 홀수의 합은 25입니다*/

package question03;

public class question03 {

	public static void main(String[] args) {
		int sum = 0;

		int i = 0;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			sum += i;

		}

		System.out.println("1부터 10까지의 홀수의 합은 " + sum + "입니다.");

	}

}
