package switchexample;

public class SwitchCaseTest2 {
	
	public static void main(String[] args) {
		// 메달 색상에 따른 메달 출력
		// 변수 medalColor
		String medalColor = "Gold";
		switch(medalColor) {
		case "Gold":
			System.out.println("금메달");
			break;
		case "Silver":
			System.out.println("은메달");
			break;
		case "Bronze":
			System.out.println("동메달");
			break;
		default:
			System.out.println("노메달");
			break;
		}
		
	}

}
