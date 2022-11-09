package question02;

public class User01 extends Thread {
	private Calculators calculator;

	public void setCalculator(Calculators calculator) {
		this.setName("Thread0");
		this.calculator = calculator;
	}

	public void run() {
		try {
			calculator.setMemory(100, 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
