package webkms;

public class ProductMain {

	public static void main(String[] args) {
	//고객(Buyer)이 전자제품 Tv, Moniter,Computer를 구매하려고 한다.

	//100만원 돈으로 가격이 20만원인 Tv, 10만원인 Moniter, 30만원인 Computer를 구입했다. 구입 가격의 10%를 포인트로 적립받을 수 있다. (포인트 바로 사용 불가)

	// 고객이 구입한 상품 목록과 총가격, 적립포인트를 출력하세요.
		ShoppingCart cart = new ShoppingCart();
        
        cart.addProduct(new Tv());
        cart.addProduct(new Tv());
        cart.addProduct(new Monitor());
        cart.addProduct(new Computer());
        cart.addProduct(new Computer());
        
        cart.displayCart();
	}

}
