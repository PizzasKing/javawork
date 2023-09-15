package constant;

public class PrintFormat {

	public static void main(String[] args) {
		// printf("문자열 포맷", 객체)
		// 정수 - %d, 실수 - %f, 문자 - %s
		// 줄바꿈 문자 - \n 
		int year = 2023;
		System.out.printf("올해는 %d년 입니다.",year);
		System.out.println("올해는"+year+"년 입니다.");
		
		float weight = 63.7F;
		System.out.printf("그의 몸무게는 %.2fkg 입니다.\n", weight);
		
		//int num = 0;
		String table = "";
		table += "--------\n";
		table += "이름 나라 나이\n";
		table += "--------\n";
		System.out.println(table);
		

	}

}
