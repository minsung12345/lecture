package webkms;

public class Book {
	String title;
	String author;
	int price;
	
	public Book() {
		System.out.println("구매하신 책의 제목,저자,가격입니다");
	this.title = "";
	this.author ="";
	}
	
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String displayBook(){
		return "제목: "+ this.title + ", 저자:" +this.author+", 가격: " +this.price;
	}
}
