package exceptions;

public class ExceptionHandiling2 {

	public static void printLength(String data) {
		// 예외처리
		try {
			//에러가 발생할 수 있는 영역
			int count = data.length();
			System.out.println("문자 수: " + count);
		} catch (NullPointerException e) {
			//에러 처리 구문
			System.out.println(e.getMessage());
			e.printStackTrace();  // 경로를 추적해서 에러를 출력
		}
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");

		printLength("지하철");
		printLength(null);

		System.out.println("[프로그램 종료]\n");

	}

}
