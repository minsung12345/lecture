package webkms;
public class Book {
    // 멤버변수 선언
    private String title;
    private int price;
    private int cnt;

    // 생성자
    public Book(String title, int price, int cnt) {
        this.title = title;
        this.price = price;
        this.cnt = cnt;
    }

    // getter 메서드
    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getCnt() {
        return cnt;
    }

   

}
