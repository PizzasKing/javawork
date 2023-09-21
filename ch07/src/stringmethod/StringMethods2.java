package stringmethod;

public class StringMethods2 {

	public static void main(String[] args) {
		//indexOf() - 검색에 도움
		//문자열이 시작되는 인덱스를 리턴
		
		String str = "Hello World Hello";
		
		int val = str.indexOf("World");
		System.out.println(val);
		
		int val2 = str.lastIndexOf("Hello");
		System.out.println(val2);
		
		int val3 = str.indexOf("ok");
		System.out.println(val3);
		
		String subject = "자바 프로그래밍";
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책");
		}else {
			System.out.println("자바와 관련되지 않은 책");
		}
	}

}
