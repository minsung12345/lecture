package webkms;

public class ProdMain {

	public static void main(String[] args) {
		
		Book book = new Book("자바",20000,"신용권 외","101024");
		Movie movie = new Movie("인사이드 아웃2",9000,"감독이름","전체관람가");
		Album album = new Album("스무살",30000,"아이유");
		
		System.out.println(book.display());
		}

}
