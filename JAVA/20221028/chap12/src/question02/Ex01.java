package question02;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		Calculators cal = new Calculators();
		
		User01 user1 = new User01();
		user1.setCalculator(cal);
		user1.start();
		user1.join();
		
		User02 user2 = new User02();
		user2.setCalculator(cal);
		user2.start();
		user2.join();
		
		User03 user3 = new User03();
		user3.setCalculator(cal);
		user3.start();
		user3.join();
		
		/*
		 * try { user01.start(); user01.join(); user02.start(); user02.join();
		 * user03.start(); user03.join(); } catch(InterruptedException e) {
		 * e.printStackTrace(); }
		 */

	}

}
