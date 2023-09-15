package transport;

public class Bus {
	// 필드
	int busNumber; // 버스 번호
	int passenger; // 승객
	int money; // 수입

	public Bus(int busNumber) {
		this.busNumber = busNumber;

	}

	// 승객을 태우다
	public void take(int fee) {
		this.money += fee; // 요금을 더해서 수입이 늘어남
		passenger++; // 승객수 증가
	}

	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 수입은 " + money + "원이고 승객 수는 " + passenger + "명 입니다.");
	}

}