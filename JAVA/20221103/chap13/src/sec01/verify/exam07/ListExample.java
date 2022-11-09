package sec01.verify.exam07;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
		/*
		 * for(Board board : list) { System.out.println(board.getTitle()+ " - "
		 * +board.getContent()); }
		 */

	}

}
