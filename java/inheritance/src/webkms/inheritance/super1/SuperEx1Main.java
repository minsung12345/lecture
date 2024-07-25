package webkms.inheritance.super1;

class Parent{
	int a = 10;
	
	Parent(){
		System.out.println("부모 기본 생성자");
	}
}

class Child extends Parent {
	int a= 20;
	
	Child(){
		System.out.println("자식 기본 생성자");
	}
	void display() {
		System.out.println("a : "+a);
		System.out.println("this.a : "+this.a);
		System.out.println("super.a : "+super.a);
	}
	
}

public class SuperEx1Main {

	public static void main(String[] args) {
		Child child = new Child();
		child.display();
	}

}
