package abstracts.template;

public class AiCar extends Car{

	@Override
	public void drive() {
		System.out.println("차가 자율 주행합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("자율주행 차가 멈춥니다.");
	}
}
