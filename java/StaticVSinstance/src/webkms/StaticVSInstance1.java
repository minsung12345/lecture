package webkms;

public class StaticVSInstance1 {
	static int sInt;
	int iInt;
	
	public void acc() {
		sInt++;
		this.iInt++;
		
		System.out.println("no : "+this.hashCode()+", sInt : "+ StaticVSInstance1.sInt + ", iInt : "+ this.iInt);
		
	}
	//초기화 블럭
	{
		// instance 멤버 초기화
		System.out.println(iInt);
		iInt = 5;
		System.out.println(iInt);
	}
	
	public static void main(String[] args) {
		for(int i =0;i<10;i++) {
			StaticVSInstance1 svi = new StaticVSInstance1();
			svi.acc();
		}
	}

}
