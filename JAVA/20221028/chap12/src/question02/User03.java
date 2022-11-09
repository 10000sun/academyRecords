package question02;

public class User03 extends Thread{
	private Calculators calculator;

	public void setCalculator(Calculators calculator) {
		this.setName("Thread2");
		this.calculator = calculator;
	}

	public void run() {
		try {
			calculator.setMemory(100, 3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
