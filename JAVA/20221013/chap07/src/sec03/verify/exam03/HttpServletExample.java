package sec03.verify.exam03;


public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
		
	}
	//System.out.println("로그인합니다.");
	//System.out.println("파일 다운로드 합니다.");
}

