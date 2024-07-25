package snippet;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//메뉴 선택
		//1. 도서정보입력 2. 총비용 3. 종료
		//	1 선택 -> 도서명, 가격, 수량 -> 정보를 출력
		//	2 선택 -> 총비용 출력
		//	3 선택 -> 종료
		// 1,2,3 중에서 선택하지 않은 경우, "올바르게 선택해 주세요"
		int tot = 0;
		int num =0;
		do {
			System.out.println("1. 도서정보입력 2. 총비용 3. 종료");
			int numberChoice = sc.nextInt();
			if(numberChoice==1) {
				sc.nextLine();
				System.out.print("도서명을 입력하세요>>");
				String bookName = sc.nextLine();
				
				System.out.print("가격을 입력하세요>>");
				int bookPrice = sc.nextInt();
				tot += bookPrice;
				
				System.out.print("수량을 입력하세요>>");
				int bookQty = sc.nextInt();
				tot *= bookQty;
			}else if(numberChoice==2) {
				System.out.println(tot);
			}else if(numberChoice==3) {
				num++;
				System.out.println("종료합니다");
			}else {
				System.out.println("올바르게 선택해 주세요");
			}
		}while (num == 0);
		
				
	}

}
