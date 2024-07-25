package webkms;

public class CartMain {

	public static void main(String[] args) {

		Cart cart = new Cart();

		Book book1 = new Book("자바", 20000, 2);
		Book book2 = new Book("JSP", 22000, 3);

		cart.addBook(book1);
		cart.addBook(book2);

		cart.displayBooks();  // 장바구니 상품을 출력하고, 전체 가격의 총합을 출력한다.
	}

}
