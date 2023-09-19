package interfaceex.remote;

public class RemoteControlTest {

	public static void main(String[] args) {
		//인터페이스형(부모 타입)으로 객체 형성 - 자동 형변환
		RemoteControl rcTV = new Television();
		
		rcTV.turnOn();
		rcTV.setVoulume(11);
		rcTV.setMute(true);
		rcTV.turnOff();
		RemoteControl.changeBattery();

	}

}
