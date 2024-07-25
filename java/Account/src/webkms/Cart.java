package webkms;

public class Cart {
	// Book배열, 전체수량
	//멤버 변수
	private Book[] books = new Book[10];
	private int bookCount;
	
	//생성자
	public Cart() {
		
	}
	//메서드
	public void addBook(Book book) {
		if(bookCount >= books.length) {
			System.out.println("장바구니에는 10개까지만 담을 수 있습니다.");
		}
		books[bookCount] = book;
		bookCount++;
		System.out.println("카트에 추가하였습니다."+bookCount);
	}
	
	public void displayBooks() {
		System.out.println("---장바구니---");
		for(int i = 0 ; i < bookCount ; i++) {
			Book book = books[i];
			System.out.println("상품명 : "+ book.getName() +", 가격 : "+ book.getPrice()+
					", 수량 : "+ book.getQuantity() + ", 합계: "+ book.getTotalPrice());
			System.out.println("-------------------------------------------------");
			System.out.println("총 상품수: " + bookCount + ", 총 가격: " + calculateTotalPrice()+"원");
		}
	}
	private int calculateTotalPrice() {
		int totalPrice = 0;
		for(int i =0;i<bookCount;i++) {
			Book book = books[i];
			totalPrice += book.getTotalPrice();
			
		}
		return totalPrice;
	}
}
