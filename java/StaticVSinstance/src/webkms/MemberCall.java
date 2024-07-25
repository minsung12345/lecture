package webkms;

public class MemberCall {
	//멤버 변수
	int iv = 10; // 인스턴스 변수
	static int cv = 20; // 클래스(static,정적) 변수
	
	int iv2 = cv; 
	//클래스 변수는 인스턴스 변수를 사용할 수 없다.
	//static int cv2 = iv;

	//정적 메서드
	static void staticMethod1() {
		System.out.println("cv = "+ cv);
		MemberCall mc = new MemberCall();
		System.out.println(mc.iv);
	}
	
	//인스턴스 메서드
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	

	
	
	
	public static void main(String[] args) {
		staticMethod1();	// 스태틱 메서드 호출
		MemberCall mc = new MemberCall();
		mc.instanceMethod1(); // 인스턴스 메서드 호출
	}

}
