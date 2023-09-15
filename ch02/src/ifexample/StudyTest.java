package ifexample;

import java.util.Scanner;

public class StudyTest {

	public static void main(String[] args) {
		// 학점 계산 프로그램 90A 80B 70C 60D 60미만F
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.: ");
		int grade = sc.nextInt();

		if (grade >= 90 && grade <= 100) {
			System.out.println("A학점 입니다.");

		} else if (grade >= 80 && grade < 90) {
			System.out.println("B학점 입니다.");
		} else if (grade >= 70 && grade < 80) {
			System.out.println("C학점 입니다.");
		} else if (grade >= 60 && grade < 70) {
			System.out.println("D학점 입니다.");
		} else if (grade > 100) {
			System.out.println("잘못입력했습니다");
		} else {
			System.out.println("F학점 입니다.");

		}

		sc.close();

	}

}
