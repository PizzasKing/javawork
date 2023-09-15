package switchexample;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// 랭킹에 따른 메달
		// 1-금 2-은 3-동
		// 변수 rank
		Scanner sc=new Scanner(System.in);
		System.out.print("등수를 입력하세요: ");
		int rank = sc.nextInt();
		
		switch(rank) {
		case 1:
			System.out.println("금메달");
			break;
		case 2:
			System.out.println("은메달");
			break;
		case 3:
			System.out.println("동메달");
			break;
		}
		sc.close();

	}

}
