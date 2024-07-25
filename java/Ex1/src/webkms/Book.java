package webkms;

public class Book extends Product {
private String author;
private String isbn;

	public Book(String name, int price, String author, String isbn) {
		super(name, price);
		this.author = author;
		this.isbn = isbn;
	}

	public String display() {
		return super.display()+"저자: "+ author + "고유번호: "+ isbn;
	}
	
}
