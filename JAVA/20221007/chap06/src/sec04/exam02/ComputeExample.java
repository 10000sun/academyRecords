package sec04.exam02;

import java.util.Scanner;

public class ComputeExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		Scanner sc = new Scanner(System.in);
		int[] value1 = new int[3];

		for (int i = 0; i < value1.length; i++) {
			value1[i] = sc.nextInt();
		}
//		int[] value1 = { 1, 2, 3 };
		int result1 = myCom.sum1(value1);
		System.out.println("result1 : " + result1);

		int result2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result2: " + result2);

		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3: " + result3);

		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
	}

}
