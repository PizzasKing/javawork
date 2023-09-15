package input;

import java.util.Scanner;

public class BonusPointTest {

	public static void main(String[] args) {
		// 고객의 이름, 구매 금액을 입력, 이름과 구매포인트 출력
		// 구매포인트(bonusPoint) = 상품가격(price) * 포인트적립율(bonusRatio)
		
		double bonusRatio=0.02;
		int bonusPoint = 0;
		
		//계산 처리
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 구매금액을 입력하세요: ");
		String name = scanner.nextLine();
		int price= scanner.nextInt();
		bonusPoint = (int)(price * bonusRatio);
		
		
		// 출력
		System.out.println(name+"고객님의 포인트는 "+bonusPoint + "원 입니다.");
		scanner.close();
	}

}
