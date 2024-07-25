package webksy;

public class orderMain {

	public static void main(String[] args) {
		order prd1 = new order();
		prd1.product = "오라클";
		prd1.price = 20000;
		prd1.cnt = 2;
		
		order prd2 = new order();
		prd2.product = "자바";
		prd2.price = 20000;
		prd2.cnt = 2;
		
		order prd3 = new order();
		prd3.product = "스프링";
		prd3.price = 20000;
		prd3.cnt = 2;
		
		order[] orders = new order[3];
		orders[0] = prd1;
				orders[1] = prd2;
				orders[2] = prd3;
		
		
		
		orders[0].displayStudent();
		orders[1].displayStudent();
		orders[2].displayStudent();
		
		for(int i=0; i<orders.length; i++) {
			System.out.print("상품명: " + orders[i].product + "가격: "+ orders[i].price +"수량 :"+orders[i].cnt);
		}
		
	}

}
