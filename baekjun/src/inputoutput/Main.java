package inputoutput;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		
		int d = 60 * a + b; // 시간을 분으로 바꾸고 둘이 더한 분
		int hour = (c - 45) / 60;  // 시간
		int minute = (c - 45) % 60;  // 분 
		if (d < 45) { // 총 분이 45보다 작으면 음수가 나오므로
			System.out.println((23 - hour) + " " + (60 + minute));
		} else
			System.out.println(hour + " " + minute);

	}
}
