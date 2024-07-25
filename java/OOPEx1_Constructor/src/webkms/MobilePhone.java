package webkms;

public class MobilePhone {
	String brandName;
	String modelName;
	int mainMemory;
	String color;
	
	public MobilePhone() { // 기본 생성자
		System.out.println("고객님~ 폰이 개통되었습니다!"); // 기본생성자를 싱행시켜 인스턴스 생성
	}
	public MobilePhone(String brandName, String modelName, int mainMemory, String color) {
		//생성자 오버로딩
		this.brandName = brandName;
		this.modelName = modelName;
		this.mainMemory = mainMemory;
		this.color = color;
		
	}
	public MobilePhone(String brandName, String modelName) {
		this.brandName= brandName;
		this.modelName = modelName;
		this.mainMemory = 256;
		this.color = "흰색";
	}
	
	
	//메서드
	public String toString() {
		return "[" + this.getClass().getName()+ ": " + this.hashCode() + "]=brandName : "+ this.brandName +
				"modelName :" + this.modelName + "mainMemory : "+ this.mainMemory + "color: "+color;
	}
}
