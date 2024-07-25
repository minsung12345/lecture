package webkms;

public class Book {
// 멤버변수 책이름, 가격, 수량
	private String name;
	private int price;
	private int quantity;
	
	// 생성자
	public Book(String name, int price, int quantity) {
		this.name = name;
		this.price= price;
		this.quantity = quantity;
	}
	// 메서드 
	public String getName() {
		
		return name;
	}
	public int getPrice() {
		return price;
		
	}
	public int getQuantity() {
		return quantity;
		
	}
	public int getTotalPrice() {
		return this.price * this.quantity;
	}
	
	public void displayBooks() {
		System.out.println("Book name: " + this.name + "Book price: " + this.price+
				"Book quantity: " + this.quantity);
	}
}
