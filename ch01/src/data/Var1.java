package data;

public class Var1 {

	public static void main(String[] args) {
		//변수를 사용
		/*1. 예약어는 변수로 사용할 수 없음. ex) class, int
		  2. 변수이름에 공백 사용할 수 없음.
		  3. 숫자로 시작할 수 없음.
		  */
		int year= 2023;
		int month=9;
		int day=5;
		System.out.println("오늘은 "+year+"년 " +month+"월 "+day+"일 입니다." );
		//문자열 자료형 - String, 한 문자 자료형 char
		String name = "손흥민";
		int grade = 3;
		int schoolClass= 2;
		System.out.println(name+"은 "+grade+"학년 "+schoolClass+"반 입니다.");

	}

}
