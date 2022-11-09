package question01;

public class ThreadTest02 extends Thread {
	private int num;

	public ThreadTest02(int num) {
		this.num = num;
	}

	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(num + "x" + i + " = " + num * i);
		}
	}

	public static void main(String[] args) {
		ThreadTest02 t1 = new ThreadTest02(5);
		ThreadTest02 t2 = new ThreadTest02(7);
		ThreadTest02 t3 = new ThreadTest02(3);
		t1.start();
		t2.start();
		t3.start();

	}

}
