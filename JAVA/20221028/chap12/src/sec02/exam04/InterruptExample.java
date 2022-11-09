package sec02.exam04;

import sec02.exam04.PrintThread2;

public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.interrupt();

	}

}
