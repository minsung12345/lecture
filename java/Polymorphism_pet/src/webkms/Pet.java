package webkms;

public class Pet {
	private String name;
	private String type;
	private int age;
	
	protected Pet() {
		
	}
	
	//생성자
	protected Pet(String name, String type, int age){
		this.name = name;
		this.type = type;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	// 메서드
	public void doWalk() {
		System.out.println("걸어다닙니다");
	}
	
	//추상 메서드
	public void doCry() {
	} // body가 없이 선언부만 만든다.
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Pet [name=" + name + ", type=" + type + ", age=" + age + "]";
	}
}
