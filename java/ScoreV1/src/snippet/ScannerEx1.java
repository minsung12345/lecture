package snippet;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요>>>");
		String name = sc.nextLine(); //엔터(\n)
		System.out.println("이름은" + name + "입니다.");
		
		
		//유저에게 숫자를 입력받아서, 짝수인지 홀수인지 출력하는 프로그램을 만드세요.
		
		System.out.println("숫자를 입력해주세요.");
		int oddEven = sc.nextInt();
		if(oddEven%2==1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		// 유저에게 숫자를 입력받아서 1부터 ~ 입력된 숫자까지의 총합을 출력하세요.
		System.out.println("숫자를 입력해주세요.");
		int user = sc.nextInt();
		int sumUser = 0;
		for(int i=1;i<=user;i++) {
			sumUser += i;
		}
		System.out.println(sumUser);
	}

}
