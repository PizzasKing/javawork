package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BoardTest {

	public static void main(String[] args) {
		//List<Board> list = new ArrayList<>();
		List<Board> list = new Vector<>();
		
		Board board1 =new Board("제목1", "내용 1입니다. ", "글쓴이1");
		Board board2 =new Board("제목2", "내용 2입니다. ", "글쓴이2");
		Board board3 =new Board("제목3", "내용 3입니다. ", "글쓴이3");
		
		list.add(board1);
		list.add(board2);
		list.add(board3);
		
		//삭제
		if(list.contains(board1)) {
			list.remove(board1);
		}
		
		System.out.println("제목: "+list.get(0).getTitle());
		System.out.println("내용: "+list.get(0).getContent());
		System.out.println("글쓴이: "+list.get(0).getWriter());

		System.out.println("================================");
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getTitle()+", "+board.getContent()+", "+ board.getWriter());
		}
	}

}
