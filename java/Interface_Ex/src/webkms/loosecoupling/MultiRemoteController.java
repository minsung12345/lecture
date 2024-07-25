package webkms.loosecoupling;

public class MultiRemoteController implements Remotable{

	@Override
	public void remoteControl(ElectronicDevice ed) {
		System.out.println("제어합니다.");
		ed.powerOn();
		
	}
	
	
	
}
