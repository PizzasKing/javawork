package objectarray.books;

public class BookMain {

	public static void main(String[] args) {
		//Book[] books = new Book[3];
		
		/*for(int i=0; i<books.length;i++) {
			System.out.println(books[i]);
		}
		*/
		// 객체 생성 (배열에 저장)
		/*books[0] = new Book("자바 프로그래밍 입문", "박은홍");
		books[1] = new Book("웹 표준의 정석", "고경희");
		books[2] = new Book("스프링 부트", "채규태");
		*/
		Book[] books= {
				new Book("자바 프로그래밍 입문", "박은홍"),
				new Book("웹 표준의 정석", "고경희"),
				new Book("스프링 부트", "채규태")
		};
		
		// 출력
		/*
		books[0].showBookInfo();
		books[1].showBookInfo();
		books[2].showBookInfo();
		*/
		for(int i = 0; i<books.length; i++) {
			System.out.println(books[i].showBookInfo());
		}
		System.out.println("===================");
		// 향상된 for 문
		// for(자료형 변수 : 배열)()
		for(Book book : books)
			System.out.println(book.showBookInfo());
		

	}

}