package webkms;

public class MobilePhoneMain {

	public static void main(String[] args) {
		
		MobilePhone phone = new MobilePhone();
		System.out.println(phone.hashCode());
		System.out.println(phone.toString());
		
		MobilePhone galaxy=new MobilePhone("삼성","갤럭시S24",256,"흰색");// 오버로딩한 생성자 호출하
		System.out.println(galaxy.toString());
		
		
		MobilePhone iphone = new MobilePhone("애플","아이폰15");
		System.out.println(iphone.toString());
		
		MobilePhone sphone = new MobilePhone("샤오미", "샤오미폰");
		System.out.println(sphone.toString());
	}

}
