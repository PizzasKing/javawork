package inheritance.transport;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void take(Vehicle vehicle, int fare) {
		vehicle.carry(fare);
		this.money -= fare;
	}
	
	// 버스를 탄다
	
	// 사람의 정보
	public void showPersonInfo() {
		System.out.println(name+"님의 남은 돈은 "+ money+ "원 입니다.");
	}
}
