package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		final int NUM = 3;
		int[] arr1 = new int[NUM];
		for (int i = 0; i < NUM; i++) {
			System.out.println("arr1[" + i + "]:" + arr1[i]);
		}
//		arr1[NUM-3] = 1;
//		arr1[NUM-2] = 2;
//		arr1[NUM-1] = 3;
		for (int j = 0; j < NUM; j++) {
			arr1[j] = (10 * (j+1));
			System.out.println("arr1[" + j + "]:" + arr1[j]);
		}

//		for (int i = 0; i < NUM; i++) {
//			System.out.println("arr1[" + i + "]:" + arr1[i]);
//		}

		double[] arr2 = new double[NUM];
		for (int i = 0; i < NUM; i++) {
			System.out.println("arr2[" + i + "]:" + arr2[i]);
		}
		arr2[NUM - 3] = 0.1;
		arr2[NUM - 2] = 0.2;
		arr2[NUM - 1] = 0.3;
		for (int i = 0; i < NUM; i++) {
			System.out.println("arr2[" + i + "]:" + arr2[i]);
		}

		String[] arr3 = new String[NUM];
		for (int i = 0; i < NUM; i++) {
			System.out.println("arr3[" + i + "]:" + arr3[i]);
		}
		arr3[NUM - 3] = "1월";
		arr3[NUM - 2] = "2월";
		arr3[NUM - 1] = "3월";
		for (int i = 0; i < NUM; i++) {
			System.out.println("arr3[" + i + "]:" + arr3[i]);
		}
	}

}
