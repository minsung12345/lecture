import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//유저에게 n개의 정수를 입력받아 배열에 저장한 후,
		//최소값, 최대값을 찾아서 출력하는 프로그램을 작성하세요.
		int n = 3;
		int[] number = new int[n];

		int minNumber = 0, maxNumber=0;
		
		for(int i = 0; i<number.length;i++) {
		System.out.print("숫자를 입력해주세요");
		number[i] = sc.nextInt();
		minNumber = number[0]; 
		maxNumber = number[0];
				
		if(maxNumber<number[i]) {
			maxNumber = number[i];
		}
		if(minNumber>number[i]) {
			minNumber = number[i];
		}
		
		}
		System.out.println("최대값은 :"+ maxNumber);
		System.out.println("최소값은 :"+ minNumber);
		
		//거스름돈을 몇개의 동전으로 지불할 수 있는지 구하는 프로그램을 작성하세요.
//		ex) 거스름돈 money = 2680원이라고 하면,
//		500원짜리 5개, 100원짜리 1개, 50원짜리 1개, 10원짜리 3개
		
		System.out.println("잔돈을 입력하세요.");
		int money = sc.nextInt();
		int fiveHundred = money/500, remain = money%500;
		int OneHundred = remain/100;
		int fifty = (remain%100)/50;
		int ten = ((remain%100)%50)/10;
		
		System.out.println("500원짜리:"+fiveHundred+"개");
		System.out.println("100원짜리:"+OneHundred+"개");
		System.out.println("50원짜리:"+fifty+"개");
		System.out.println("10원짜리:"+ten+"개");
		
		
		
		
		
		
		
		
	}

}
