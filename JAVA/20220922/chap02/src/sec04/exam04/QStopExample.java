package sec04.exam04;

public class QStopExample {
	public static void main(String[] args) throws Exception {
		int keyCode;

		while (true) {
			keyCode = System.in.read();
			System.out.println("KeyCode: " + keyCode);
			if(keyCode == 48) {
				break;
			}
		}
	}
}
