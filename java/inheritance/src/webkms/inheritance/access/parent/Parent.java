package webkms.inheritance.access.parent;

public class Parent {
	public int publicVal;
	protected int protectedVal;
	int defaultVal;
	private int privateVal;
	
	public void publicMethod() {
		System.out.println("Parent publicMethod()");
		
	}
	public void protectedMethod() {
		System.out.println("Parent protectedMethod()");
	}
	void defaultMethod() {
		System.out.println("Parent defaultMethod");
	}
	private void privateMathod() {
		System.out.println("Parent privateMathod()");
	}
	public void displayParent() {
		System.out.println("Parent 클래스");
		System.out.println("public");
		System.out.println();
		System.out.println();
	}
	
}
