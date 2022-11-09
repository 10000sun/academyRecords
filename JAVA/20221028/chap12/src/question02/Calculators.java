package question02;

public class Calculators {
	private int memory;
	private int key;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory, int key) {
		this.memory = memory;
		this.key = key;
		try {
			for (int i = 0; i <= 3; i++) {
				memory += i;
				System.out.println(Thread.currentThread().getName() + ": " + this.memory++);
				Thread.sleep(key);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
