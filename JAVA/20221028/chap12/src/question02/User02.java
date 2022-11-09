package question02;

public class User02 extends Thread {
	private Calculators calculator;

	public void setCalculator(Calculators calculator) {
		this.setName("Thread1");
		this.calculator = calculator;
	}

	public void run() {
		try {
			calculator.setMemory(100, 2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
