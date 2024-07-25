package webkms.loosecoupling;

public class RemoteMain {
	public static void main(String[] args) {
	Tv tv = new Tv("LG");
//	tv.powerOn();
	
	MultiRemoteController mrc = new MultiRemoteController();
	mrc.remoteControl(tv);
	
	//세탁기 추가
	Washer washer = new Washer("삼성");
	mrc.remoteControl(washer);
	
	
	}
		
}
