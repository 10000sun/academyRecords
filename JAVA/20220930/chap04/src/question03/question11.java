
//문제11. 로또 번호 생성기 자바프로그램을 작성하시오. 단, 1부터 45까지의 숫자를 6개 출력한다.

package question03;

public class question11 {

	public static void main(String[] args) {
		System.out.print("나온 숫자는 (");
		for (int i = 1; i <= 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			System.out.print(num + " ");

		}
		System.out.print(") 입니다.");

	}

}
