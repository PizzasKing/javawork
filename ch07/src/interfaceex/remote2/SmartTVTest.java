package interfaceex.remote2;
import  interfaceex.remote.RemoteControl;

public class SmartTVTest {

	public static void main(String[] args) {
		SmartTV stv1 = new SmartTV();
		
		RemoteControl rc = stv1;
		Searchable searchable = stv1;
		
		rc.turnOn();
		rc.setVoulume(8);
		searchable.search("www.naver.com");
		rc.setMute(true);
		
		rc.turnOff();
		
		RemoteControl.changeBattery();

	}

}
