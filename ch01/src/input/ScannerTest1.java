package input;

import java.util.Scanner;

public class ScannerTest1 {
	
	public static void main(String[] args) {
		// 입력 처리 - Scanner 클래스 사용
		// 문자열 - nextLine() 숫자 - nextInt()
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = scanner.nextLine();
		
		System.out.println(name);
		*/
		
		// 나이 입력
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		
		int age = scanner.nextInt();
		System.out.println(age);
		
		scanner.close();
		
	}

}
