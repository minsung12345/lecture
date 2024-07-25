package webkms.inheritance.basic2;

public class CarMain {

	public static void main(String[] args) {
		ElectricCar electricCar = new ElectricCar();
		electricCar.startEngine();
		electricCar.accelerrate();
		electricCar.charge();
		
		GasCar gasCar = new GasCar();
		gasCar.startEngine();		
		gasCar.accelerate();
		gasCar.fillUpGas();
		
		
		// 감속, 시동끄는 기능 Car 클래스에 추가
		electricCar.decelerate();
		
		//
//		Car car = new Car();
		// car.charge(); // 사용 X
		
		//소방차 추가
		FireEngine fireEngine = new FireEngine();
		fireEngine.startEngine();
		fireEngine.hoseWater();
		
		//하이브리드차생성
//		HybridCar hybrid new Hybridcar();
//		hybird.startEngine();
//		
	}

}
