package banking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 은행 업무
		// 1.예금 2.출금 3.잔고조회 4.종료
		// 메뉴 화면 만들기
		Scanner sc = new Scanner(System.in);
		int balance = 0; // 잔고
		boolean sw = true; // 상태 변수
		
		while(sw) {
		System.out.println("===============================");
		System.out.println("1.예금 | 2.출금 | 3.잔고조회 | 4.종료");
		System.out.println("===============================");
		
		int selNum = sc.nextInt();
		switch(selNum) {
		case 1:
			System.out.print("예금액: \n");
			int deposit = sc.nextInt();
			balance += deposit;
			break;
		case 2:
			System.out.println("출금액: \n");
			int withdraw = sc.nextInt();
			if(balance<withdraw) {
				System.out.println("잔액이 부족합니다. 다시입력하세요.");
			}
			else {
				balance -= withdraw;
				}
			break;
		case 3:
			System.out.printf("잔고는 %d원 입니다.\n", balance);
			break;
		case 4:
			sw = false;
			break;
			
		default:
			System.out.println("오류입니다. 다시입력하세요.");
			
		}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
