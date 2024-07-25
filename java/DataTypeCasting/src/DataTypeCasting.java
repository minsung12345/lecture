
public class DataTypeCasting {

	public static void main(String[] args) {
		//데이터 타입 형 변환 (cast)
		byte b = 125;
		System.out.println(b);
		// 묵시적(자동) 형 변환(casting) : 프로그래머가 형 변환 연산자를 쓰지 않더라도 자동으로 형변환.
		// 보통. 작은 타입에서 큰 타입으로 변환할 때 묵시적 형 변환이 일어남.
		int i = b;
		System.out.println("i :"+ i);
		
		// int -> float
		float f = 1234; 
		float f1 = (float)1234; // 원래 이와같이 형변환이 있어야 하지만, 생략이 된다.
		
		// float -> int
//		int j = 3.14f; //Type mismatch: cannot convert from float to int	
		int k = (int)3.14f;
		System.out.println("k :"+k);
		
		
		int i2 = 126;
//		byte b2 = i2; //Type mismatch: cannot convert from float to int
		byte b2 = (byte)i2;
		System.out.println(b2);
		
		
		byte b3 = 100;
		byte b4 = b3;
		
		// 명시적 형변환 : 프로그래머가 형변환을 하라고 명시해 놓는 것 (큰 타입 -> 작은 타입 변화)
		// (형변환할데이터타입) 캐스팅할 변수
		// double -> float
		double pi = 3.141592;
		System.out.println("pi: "+pi);
//		float fpi = pi; // cannot convert from double to float
		float fpi = (float)pi;
		System.out.println("fpi: "+fpi);
		
		// int -> short
		int i3 = 32767;
		short s = (short)i3;
		System.out.println("s:"+ s);
		
		
		// 연산식에서 자동형변환
		// 리터럴이 피연산자
		byte bSum = 10 + 20;
		
		//변수가 피연산자인 경우
		byte b7 = 10;
		byte b8 = 20;
		byte bResult = (byte) (b7 + b8);
		System.out.println(bResult);
		int bRsult = b7 + b8;
		System.out.println(bRsult);
		
		// int 타입과 long타입 연산
		long l3 = 50;
		int i6 = 60;
//		int result = l3 + i6; //   cannot convert from long to int
		int result = (int)(l3 + i6);
		
		//실수연산
		float f3 = 3.14F + 4.31f;
		System.out.println(f3);
		
		float f4 = (float)(3.14F + 4.3);
		double f5 = 3.1F + 4.3;
		
		//int, double
		int intNum = 10;
		double dblNum = 3.14;
		double sum1 = intNum + dblNum;
		System.out.println(s);
		
		//정수, 실수를 나누기
		int intNum1 = 1;
		int intNum2 = 2;
		float divNum1 = intNum1 / intNum2;
		System.out.println(divNum1);
		

	}

}
