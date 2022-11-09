package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar=new Car();
		
		myCar.setGas(20);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState){
			System.out.println("Start.");;
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("Don't have to insert the gas.");
		} else {
			System.out.println("Have to insert the gas.");
		}

	}

}
