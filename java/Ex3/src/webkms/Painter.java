package webkms;

public class Painter {
	private String name;
	
	Painter(String name){
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// 그림그리는 메서드
	public void drawShape(Circle circle) {
		System.out.println(name + "가" + circle.toString() + "인 원을 그립니다.");
	}
	
	
	@Override
	public String toString() {
		return "Painter [name=" + name + "]";
	}
	
}
