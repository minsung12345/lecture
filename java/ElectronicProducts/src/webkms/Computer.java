package webkms;

public class Computer extends Product{

	public Computer() {
		super("Computer", 300000);
	}

	@Override
	public void displayProduct() {
		System.out.println(getName()+": "+getPrice()+"원");		
	}
	
}
