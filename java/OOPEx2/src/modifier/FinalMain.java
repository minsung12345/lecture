package modifier;

public class FinalMain {

	public static void main(String[] args) {
		ConstructInit ci1 = new ConstructInit(10);
		System.out.println(ci1.value);
		//final을 필드에 사용할 경우, 생성자를 통해서 한번만 초기화될 수 있다.
//		ci1.value = 20;
		
		ConstructInit ci2 = new ConstructInit(20);
		System.out.println(ci2.value);
		
		//
		System.out.println("field 초기화........");
		FieldInit fi1 = new FieldInit();
		System.out.println(fi1.value);
		
		FieldInit fi2 = new FieldInit();
		System.out.println(fi2.value);
		
		FieldInit fi3 = new FieldInit();
		System.out.println(fi3.value);
//		System.out.println(fi3.CONST_VALUE);
		
		System.out.println(Math.PI);
		System.out.println(FieldInit.CONST_VALUE);
		
		
		
	}

}
