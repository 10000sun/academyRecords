package sec02.question;

public class question07 {

	public static void main(String[] args) {
		float var1 = 10f;
		float var2 = var1 / 100;
		if (var2 == 0.1) {
			System.out.println("10% 입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
		
		//방법 1) double로 바꾼다.
	/*	float var1 = 10f;
		float var2 = var1 / 100;
		if (var2 == 0.1) {
			System.out.println("10% 입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}*/
		
		//방법 2) var2를 0.1f로 바꾼다.
	/*	float var1 = 10;
		float var2 = var1 / 100;
		if (var2 == 0.1f) {
			System.out.println("10% 입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}*/
		
	}

}
