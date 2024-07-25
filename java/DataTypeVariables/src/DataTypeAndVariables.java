
public class DataTypeAndVariables {

	public static void main(String[] args) {
		//boolean : true | false (1byte)
		boolean bool = true; // 변수 bool를 선언과 할당
		System.out.println(bool);
		
		// char : 문자형. 2byte. 한 문자를 저장
		char character = 'a';
		System.out.println(character);
		char character2 = '1';
		System.out.println(character2);
		char korChar = '가';
		System.out.println(korChar);
		char character3 = '\u0041';
		System.out.println(character3);
		
		//byte : 정수형. 1byte
		byte b = 127;
		System.out.println(b);
		
		System.out.println("Byte타입의 최대값 :" + Byte.MAX_VALUE);
		System.out.println("Byte타입의 최소값 :" + Byte.MIN_VALUE);

		byte b1 = (byte)128;
		System.out.println(b1); //-128 (overflow)
		
		//short : 정수형. 2byte
		short sInt = 128;
		System.out.println(sInt);
		System.out.println("short타입의 최대값 :" + Short.MAX_VALUE);
		System.out.println("short타입의 최소값 :" + Short.MIN_VALUE);
		
		// int : 정수형 4byte
		int i = 35;
		System.out.println(i);
		System.out.println("int타입의 최대값 :" + Integer.MAX_VALUE);
		System.out.println("int타입의 최소값 :" + Integer.MIN_VALUE);
		
		
		//long : 정수형 8byte
		long l = 35L; // L, l 리터럴 접미
		System.out.println(l);
		System.out.println("long타입의 최대값 :" + Long.MAX_VALUE);
		System.out.println("long타입의 최소값 :" + Long.MIN_VALUE);
		
		//float : 실수형. 4byte
//		float f = 3.14; //에러 Description	Resource	Path	Location	Type
//		Type mismatch: cannot convert from double to float	DataTypeAndVariables.java	/DataTypeVariables/src	line 49	Java Problem
		float f = 3.14f;
		System.out.println(f);
		System.out.println("float타입의 최대값 :" + Float.MAX_VALUE);
		System.out.println("float타입의 최소값 :" + Float.MIN_VALUE);
		
		// double : 실수형. 8byte
		double d = 3.14;
System.out.println(d);
System.out.println("double타입의 최대값 :" + Double.MAX_VALUE);
System.out.println("double타입의 최소값 :" + Double.MIN_VALUE);
		
	//문자열 (String) : 참조타입
	// char 리터럴 작은따옴표
	// 두 문자 이상은 문자열로, 큰 따옴표로 감싼다. -문자열 리터럴
	String str = "대한민국";
	System.out.println(str);
	
	System.out.println("str의 길이 :" + str.length());
	System.out.println(str.getClass().getName());
	
	char ch = ' ';
	



	}

}
