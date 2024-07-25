package webkms.inheritance.access.child;

import webkms.inheritance.access.parent.Parent;

public class Child extends Parent{
	
	public void displayChild() {
		publicVal = 1;
		protectedVal = 1;
//		defaultVal = 1; // 다른 패키지 이므로 접근 불가
//		privateVal = 1; // 다른 클래스이므로 접근 불가
		
		publicMethod();
		protectedMethod();
//		defaltMethod(); // 다른 패키지 이므로 접근 불가
//		privateVal(); // 다른 클래스이므로 접근 불가
		
		displayParent();
		
		
	}
	
}
