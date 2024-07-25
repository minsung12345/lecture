package webkms.tightcoupling;

public class Tv {
	
	private String brandName;
	Tv(String brandName){
		this.brandName = brandName;
	}
	
	public void powerOn() {
		System.out.println(brandName+"Tv가 켜집니다.");
	}
}
