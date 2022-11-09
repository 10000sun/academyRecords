package sec01.exam02;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
		/* 실행문을 바로 붙이고 싶을 때
		 * } public static void main(String[] args) { Student st = new Student("홍길동",
		 * "123456-1234567", 1); System.out.println("name : " +st.name);
		 * System.out.println("ssn : " +st.ssn); System.out.println("studentNo : "
		 * +st.studentNo);
		 */
	}

}
