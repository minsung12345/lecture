package pet;

import webkms.Pet;

public class Cat extends Pet{

	public Cat() {
		super();
	}
	public Cat(String name, String type, int age) {
		super(name,type,age);
		
//		this();
	}
	
	public void doCry() {
		System.out.println("야옹야옹");
	}
}
