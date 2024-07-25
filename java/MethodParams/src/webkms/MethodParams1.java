package webkms;

public class MethodParams1 {
	
	public static void callPrimitiveParam(int x) {
		x = 20;
	}
	
	
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println("메서드 호출 전 a=:"+a);
		callPrimitiveParam(a);
		System.out.println("메서드 호출 후 a=:"+a); // 10?
		
		Data dataA = new Data();
		System.out.println(dataA.value);
		dataA.value = 10;
		System.out.println(dataA.value);
		callPrimitiveParam(dataA.value);
		System.out.println(dataA.value);
		
	}

}
