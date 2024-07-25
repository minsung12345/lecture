package webkms;

public class Rectangle extends Shape{
	private double radius;
	
	public Rectangle(String name, String color,int X,int Y,double radius) {
		super(name, color,X,Y);
		this.radius = radius;
		
	}
	public String display() {
		return super.display() +", 반지름:"+radius;
				}
	
}
