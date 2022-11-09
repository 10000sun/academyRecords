package sec02.verify.exam04;

public class exam04_1 {

	public static void main(String[] args) {
		int min = 100;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}

			System.out.println("min: " + min);

	}

}
