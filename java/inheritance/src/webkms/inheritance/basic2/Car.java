package webkms.inheritance.basic2;

public class Car {
	public void startEngine() {
		System.out.println("차를 시동겁니다.");
	}
	
	public void accelerrate() {
		System.out.println("차를 가속합니다.");
	}
	//기능추가
	public void decelerate() {
		System.out.println("차를 감속합니다.");
	}
	public void turnOffengine() {
		System.out.println("시동을 끕니다.");
	}
}
