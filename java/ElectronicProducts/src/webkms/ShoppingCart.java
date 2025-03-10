package webkms;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> productList = new ArrayList<>();
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	 public void displayCart() {
	        int totalPrice = 0;
	        int currentPrice = 1000000;
	        System.out.println("현재 가지고 있는 금액: "+currentPrice);
	        System.out.println("구매한 상품 목록:");
	        for (Product product : productList) {
	            product.displayProduct();
	            totalPrice += product.getPrice();
	            currentPrice -= product.getPrice();
	        }
	        int Points = (int) (totalPrice * 0.1);
	        System.out.println("총 가격: " + totalPrice + "원");
	        System.out.println("적립 포인트: " + Points + "P");
	       System.out.println("남은 금액: " + currentPrice+"원");
	        
	    }
}
