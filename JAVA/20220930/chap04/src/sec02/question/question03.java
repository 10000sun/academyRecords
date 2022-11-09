package sec02.question;

public class question03 {

	public static void main(String[] args) {
		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			System.out.print("(" + dice1 + ", ");
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.println(dice2 + ")");
			if (dice1 + dice2 == 5) {
				break;
			}
		}
		System.out.println("주사위의 합이 5입니다.");
	}

}
