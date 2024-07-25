package webkms.loosecoupling;

public class Washer implements ElectronicDevice {

	private String brandName;
	Washer(String brandName){
		this.brandName = brandName;
	}
	
	@Override
	public void powerOn() {
		System.out.println(toString()+"커집니다.");
	}

	@Override
	public String toString() {
		return "Washer [" + brandName + "]";
	}
	
	

}
