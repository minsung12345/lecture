package webkms;

import pet.Cat;
import pet.Dog;

public class PetMain {

	public static void main(String[] args) {

		Dog mydog = new Dog("뚜비","포메라니안",3);
		System.out.println(mydog.toString());
		mydog.doCry();
		mydog.doWag();
		
		Cat myCat = new Cat("나비", "샴", 2);
		System.out.println();
		myCat.doCry();
		
	}

}
