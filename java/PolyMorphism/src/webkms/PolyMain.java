package webkms;

public class PolyMain {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.parentMethod();
		
		Child child = new Child();
		child.childMethod();
		
		//다형성
		//조상 클래스타입의 참조변수로 자손클래스의 인스턴스를 참조
		Parent poly = new Child();
		poly.parentMethod();
//		poly.childMethod(); // undefined
		
	}

}
