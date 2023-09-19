package step1;

public class CarTest {
	public static void go() {
		
	}
	public static void main(String[] agrs) {
		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();
	}

}
