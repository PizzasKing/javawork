package methods;

public class MethodTest1 {
	// 함수 정의와 호출
	
	
	
	public static void main(String[] args) {
		sayHello(); // 호출
		sayHello2("파이썬");
		sayHello2("홍길동");
	}
	// sayHello()이름의 함수를 정의
	// void - 반환값이 없음(비어있음)
    public static void sayHello() {
		System.out.println("안녕하세요.");
	}
    
    // 매개변수(parameter)가 있는 함수를 정의
    public static void sayHello2(String name) {
    	System.out.println("안녕하세요. " + name);
    	
    }
}
