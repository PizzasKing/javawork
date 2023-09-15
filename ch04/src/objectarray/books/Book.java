package objectarray.books;

public class Book {
	private String bookName;
	private String author;

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public String showBookInfo() {
		//System.out.println(bookName + ", "+ author);
		return bookName + ", "+ author;
	}

}
