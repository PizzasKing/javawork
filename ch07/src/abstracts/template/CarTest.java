package abstracts.template;

public class CarTest {

	public static void main(String[] args) {
		//Car car = new Car(); // 추상클래스는 객체 생성x
		//추상클래스 타입으로 객체 생성
		Car manualCar = new ManualCar();
		manualCar.run();
		System.out.println("===============");
		Car myCar = new AiCar();
		myCar.run();

	}

}
