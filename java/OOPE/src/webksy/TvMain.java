package webksy;

public class TvMain {

	public static void main(String[] args) {
		// 절차지향적
		boolean isOn = false;
		int volume = 0;
		
		isOn = true; // 티비 켜기
		System.out.println("티비가 켜집니다.");
		
		volume++; // 볼륨 증가
		System.out.println("TV 볼룸 : " + volume);
		
		volume++; // 볼륨 증가
		System.out.println("TV 볼룸 : " + volume);
		
		volume--; // 볼륨 감소
		System.out.println("TV 볼룸 : " + volume);
		
		//상태확인
		if(isOn) {
			System.out.println("티비가 켜져있습니다, 현재볼륨:" + volume);
		}else {
			System.out.println("티비가 꺼져있습니다.");
		}
		
		isOn = false;
		System.out.println("티비가 꺼집니다.");
	}

}
