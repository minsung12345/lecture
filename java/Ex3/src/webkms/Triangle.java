package webkms;

public class Triangle extends Shape{
	private double width;
	private double length;
	
	public Triangle(String name, String color,int X,int Y,double width, double length) {
		super(name, color,X,Y);
		this.width = width;
		this.length =length;
	}

	public String display() {
		return super.display() + ", 가로:" +width +", 세로:"+length;
	}
}
