package webkms;

public class Cart {
    // 멤버변수 선언
    private Book[] books;
    private int bookCount;

    // 생성자
    public Cart() {
        books = new Book[10];
        bookCount = 0;
    }

    // 책을 장바구니에 추가하는 메서드
    public void addBook(Book book) {
        if (bookCount < 10) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("장바구니에는 10개까지만 담을 수 있습니다");
        }
    }

    // 장바구니의 책들을 출력하고 전체 가격의 총합을 출력하는 메서드
    public void displayBooks() {
        int totalPrice = 0;
        System.out.println("장바구니 상품 목록:");
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            System.out.println(book.getTitle() + " - 가격: " + book.getPrice() + "원, 수량: " + book.getCnt());
            totalPrice += book.getPrice() * book.getCnt();
        }
        System.out.println("전체 가격의 총합: " + totalPrice + "원");
    }
}
