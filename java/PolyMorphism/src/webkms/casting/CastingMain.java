package webkms.casting;

public class CastingMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.drive();
		
//		FireEngine fireEngine = (FireEngine)car; // 컴파일은 통과. 런타입(실행시) 오류 발생
//		fireEngine.hoseWater();
		
		
		//다운캐스팅 (부모타입 -> 자손타입)
		Car poly = new FireEngine(); // 업캐스팅 (자손타입 -> 부모타입)
		poly.drive();
//		poly.hoseWater();
		
		// 업캐스팅한 후, 다운캐스팅
		// 다운캐스팅
		FireEngine fireEngine2 = (FireEngine) poly;
		fireEngine2.hoseWater();
	}

}
