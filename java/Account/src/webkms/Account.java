package webkms;

public class Account {
//deposit(), withdraw(),getBalance()
	private int balance;
	public void deposit(int money) {
		if (isValid(money)) {
			this.balance += money;
		}else {
			System.out.println("유효하지 않은 금액입니다.");
		}
	}
	public void withdraw(int money) {
		if (isValid(money)&&(this.balance-money)>=0) {
			balance -= money;
		}else {
			System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
		}
	}
	public int getBalance() {
		return balance;
	}
	
	
	
	private boolean isValid(int money) {
		return money > 0;
	}
}
