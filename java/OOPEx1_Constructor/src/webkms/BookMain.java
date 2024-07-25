package webkms;

public class BookMain {

	public static void main(String[] args) {
		//아래의 코드가 동작되도록 Book클래스를 만들어 보세요
		//중복코드는 최대한 줄여봅시다.ㅣ
		Book book1 = new Book();
		System.out.println(book1.displayBook()); // 책 속성값 출력 (제복, 저자, 가격)
		
		Book book2 = new Book("자바","신용권 외");
		System.out.println(book2.displayBook());  // 책 속성값 출력
		
		Book book3 = new Book("오라클", "이지훈", 23000);
		System.out.println(book3.displayBook()); // 책 속성값 출력
		}

}
