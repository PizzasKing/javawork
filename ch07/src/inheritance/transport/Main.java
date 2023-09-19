package inheritance.transport;

public class Main {

	public static void main(String[] args) {
		// Person 객체 생성
		Person sohee = new Person("박소희",10000);
		Person park = new Person("박명수", 50000);
		
		// Bus 객체 생성
		Bus bus100 = new Bus("100번 버스");
		KakaoTaxi taxi1111 = new KakaoTaxi("1111번 택시");
		
		sohee.take(bus100, 1500);
		park.take(taxi1111, 10000);
		
		sohee.showPersonInfo();
		bus100.showInfo();
		
		park.showPersonInfo();
		taxi1111.showInfo();

	}

}
