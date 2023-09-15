package switchexample;

public class SwitchCaseTest4 {
	public static void main(String[] args) {
		// 달 별로 요일
		int month = 14;
		int day=0;
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:
			day=31;
			break;
		case 2:
			day=28;
			break;
		case 4, 6, 9, 11:
			day=30;
			break;
		default:
			System.out.println("오류");
		}
		System.out.println(day);
	}

}
