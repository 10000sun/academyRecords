package question01;

public class ThreadTest01 {
	private int num;

	public ThreadTest01(int num) {
		this.num = num;
	}

	public void cal() {
		for (int i = 1; i < 10; i++) {
			System.out.println(num + "x" + i + " = " + num * i);
		}
	}

	public static void main(String[] args) {
		ThreadTest01 t1 = new ThreadTest01(5);
		ThreadTest01 t2 = new ThreadTest01(7);
		ThreadTest01 t3 = new ThreadTest01(3);
		t1.cal();
		t2.cal();
		t3.cal();
	}
}
