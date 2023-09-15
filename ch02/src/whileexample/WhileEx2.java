package whileexample;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		// 반복문 활용
		
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int n = sc.nextInt();
		while(i<n) {
			i=i+1;
			System.out.println(i);
		}
				
		sc.close();
		

	}

}
