package sec04.question03;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		boolean result = ms.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("ID또는 PASSWORD가 틀립니다.");
		}

	}

}
