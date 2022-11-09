package sec04.exam03;

public class Car {

	int gas;

	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("Not enough gas.");
			return false;
		}
		System.out.println("Have enough gas");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				if (gas % 2 == 1) {
					gas -= 1;
					continue;
				}
				System.out.println("Run. (gas Left : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("Stop. (gas Left : " + gas + ")");
				return;
			}
		}
	}

}
