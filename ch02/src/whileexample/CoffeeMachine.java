package whileexample;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		// 커피 자동판매기 구현 프로그램
		// 커피 총 개수 5
		// 커피값은 500원 투입하면 커피 나옴
		// 500원 초과하면 거스름돈 커피 나옴
		// 500원 부족하면 커피 안나옴
		// 커피 다 떨어지면 "판매 중단" 출력, 종료
		Scanner sc = new Scanner(System.in);
		int coffee = 5;
		
		while(true) {
			System.out.print("돈을 넣어주세요: ");
			int money=sc.nextInt();
			if(money==500) {
				coffee -=1;
				System.out.println("커피가 나왔습니다. 남은 커피: "+ coffee);
			}
			else if(money>500) {
				coffee -=1;
				System.out.println("커피가 나왔습니다. 잔돈은 "+ (money-500)+"원 입니다. 남은 커피: "+coffee);
			}
			else if(coffee == 0) {
				System.out.println("품절입니다. 남은 커피: "+coffee);
				break;
			}
			else
				System.out.println("돈을 더 넣어주세요.");
				
		}sc.close();// while 끝
	
		

	}// main 끝
}
