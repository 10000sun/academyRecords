package Stream;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*문제4. 간단한 도서관리 프로그램을 작성하여 보시오. 
 * 단, 여러 권의 책을 무한반복시켜 입력하는데 필드명은 도서명(bookname), 저자(author), 출판사(pub), 페이지수(pages), 가격(price)으로
 * 하고 키보드로 입력받으시오. 그리고, 도서명(bookname), 출판사(pub), 가격(price), 저자(author), 페이지(pages) 순으로 
 * 모니터와 파일(book.txt)로 출력하시오. 단, "그만 입력하시겠습니까(y/n)?"라고 출력하고 Y또는 y를 입력하면 반복문을 종료시키고 
 * N 또는 n을 입력하면 계속 입력하시오.*/

public class BookManagement {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:/test1.txt");
		PrintStream ps = new PrintStream(fos);
		Scanner sc = new Scanner(System.in);
		String bookname;
		String author;
		String pub;
		int pages;
		int price;
		String quit;

		while (true) {
			System.out.println();
			System.out.println("도서관리 프로그램");
			System.out.println("도서명을 입력하세요");
			bookname = sc.nextLine();
			System.out.println("저자를 입력하세요");
			author = sc.nextLine();
			System.out.println("출판사를 입력하세요");
			pub = sc.nextLine();
			System.out.println("페이지수를 입력하세요");
			pages = Integer.parseInt(sc.nextLine());
			System.out.println("가격을 입력하세요");
			price = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			String save = "도서명 : " + bookname + ", 출판사 : " + pub + ", 가격 : " + price + "원, 저자 : " + author + ", 페이지 : " + pages;
			ps.println(save);
			System.out.println(save);
			
			System.out.println("그만 입력하시겠습니까? (y/n)");
			quit = sc.nextLine();
			if (quit.equals("y")) {
				break;
			} else if (quit.equals("q")){
				continue;
			}
			System.out.println();
			
		}

		ps.flush();
		ps.close();

	}

}
