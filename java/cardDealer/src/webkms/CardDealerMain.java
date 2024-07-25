package webkms;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class CardDealerMain {

	public static void main(String[] args) {
		String num[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		
		
		boolean runBool = true;
		
		while(runBool) {
			outputMenu();
			String[] cards = cardsNum(num);
			System.out.print("숫자를 입력해주세요>>>>");
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("딜러가 새로운 카드를 개봉합니다.");
				cardsNum(num);
				System.out.println(Arrays.toString(cards));
				break;
			case 2:
				System.out.println("카드를 섞습니다.");
				shuffle(cards);
				System.out.println(Arrays.toString(cards));
				break;
			case 3:
				System.out.println("카드를 한장을 지급합니다.");
				System.out.println(pickCard(cards));
				break;
			case 9:
				System.out.println("게임을 종료합니다.");
				runBool = false;
				break;
			}
		}
	}

	private static void outputMenu() {
		System.out.println("===================");
		System.out.println("1.카드개봉");
		System.out.println("2.카드섞기");
		System.out.println("3.카드 한장 지급");
		System.out.println("9.종료");
		System.out.println("===================");
	}

	private static String[] cardsNum(String num[]) {
		String[] cards = new String[4 * num.length];
		String[] suits = {"heart","clover","spade","diamond"};
		int cnt = 0;
		for(String suit : suits) {
			for(String value:num) {
				cards[cnt++] = suit + ": "+ value;
			}
		}
		
		return cards;
	}

	private static String[] shuffle(String cards[]) {
		Random rand = new Random();
		
		  for (int i = 0; i < cards.length; i++) {
	            int randomIndex = rand.nextInt(cards.length);
	            String temp = cards[i];
	            cards[i] = cards[randomIndex];
	            cards[randomIndex] = temp;
	        }
		return cards;
	}
	private static String pickCard(String cards[]) {
		Random rand = new Random();
        int randomIndex = rand.nextInt(cards.length);
		String pick=cards[randomIndex];
		return pick;
	}
}
