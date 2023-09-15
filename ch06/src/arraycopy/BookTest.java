package arraycopy;

public class BookTest {

	public static void main(String[] args) {
		// 객체를 저장할 배열 생성
		Book[] books = new Book[3];
		
		Book book1 = new Book("개미", "베르나르");
		Book book2 = new Book("태백산맥", "조정래");
		Book book3 = new Book("코스모스", "칼 세이건");
		
		//인덱스 순서에 따라 저장
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		for(int i =0; i<books.length; i++) {
			System.out.println(books[i]);
		}
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());

	}

}
