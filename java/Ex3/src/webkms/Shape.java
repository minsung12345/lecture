package webkms;

public class Shape {
	private String name;
	private String color;
	private int X;
	private int Y;
	
	
	public Shape(String name, String color, int X, int Y) {
		this.name = name;
		this.color = color;
		this.X = X;
		this.Y = Y;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}


	public String display() {
		return "이름: " + name + ", 색상 :"+ color +", X축:" + X +", Y축:" + Y;
	}
}
