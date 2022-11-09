package sec03.exam01;

public class enumExample {

	public static void main(String[] args) {
		Week today = Week.FRIDAY;
		
		switch(today) {
		case SATURDAY:
			System.out.println("오늘은 토요일 입니다.");
			break;
		case SUNDAY:
			System.out.println("오늘은 일요일 입니다.");
			break;
		default:
			System.out.println("오늘은 주말이 아닙니다.");
			break;
			
		}
	}

}
