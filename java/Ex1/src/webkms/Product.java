package webkms;

public class Product {
	private String name;
	private int price;


	public Product(String name, int price) {
//		super();
		this.name = name;
		this.price = price;
	}

	public String display() {
		return "이름 : " + name + ", 가격: " + price;
	}


	public int getPrice() {
		return price;
	}
	
	
	
}
