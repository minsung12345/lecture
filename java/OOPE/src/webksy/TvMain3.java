package webksy;

public class TvMain3 {

	public static void main(String[] args) {
		TvData data = new TvData();
		on(data);
		volumeUp(data);
		volumeUp(data);
		volumeDown(data);
		checkStatus(data);
		off(data);
	}
	static void on(TvData data) {
		data.isOn = true;
		System.out.println("티비가 켜집니다.");
	}
	
	static void volumeUp(TvData data) {
		data.volume++;
		System.out.println("Tv 볼륨:"+data.volume);
	}
	static void volumeDown(TvData data) {
		data.volume--;
		System.out.println("Tv 볼륨:"+data.volume);
	}
	static void checkStatus(TvData data) {
		if(data.isOn) {
			System.out.println("티비가 켜져있습니다, 현재볼륨:" + data.volume);
		}else {
			System.out.println("티비가 꺼져있습니다.");
		}
	}
	static void off(TvData data) {
		data.isOn = false;
		System.out.println("티비가 꺼집니다.");
	}
}
