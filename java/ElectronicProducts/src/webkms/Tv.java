package webkms;

public class Tv extends Product{

	public Tv() {
		super("TV", 200000);
	}
	
	@Override
	public void displayProduct(){
		System.out.println(getName()+": "+getPrice()+"원");
	}
}
