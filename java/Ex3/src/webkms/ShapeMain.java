package webkms;

public class ShapeMain {

	public static void main(String[] args) {
		
		
		Circle circle = new Circle("직각사각형","빨간색",7,8,3.14,3.33);
		System.out.println(circle.display());
		Triangle triangle = new Triangle("사다리꼴","파란색",5,6,85.33,34.31);
		System.out.println(triangle.display());
	}

}
