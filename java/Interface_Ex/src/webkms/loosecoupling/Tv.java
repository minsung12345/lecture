package webkms.loosecoupling;

public class Tv implements ElectronicDevice{
	private String brandName;
	
	// 생성자
	public Tv(String brandName) {
		this.brandName = brandName;
	}
	

	@Override
	public void powerOn() {
		System.out.println(this.toString()+"Tv가 켜집니다.");
	}
	
	@Override
	public String toString() {
		return "Tv [" + brandName + "]";
	}
}
