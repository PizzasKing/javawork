package interfaceex.calculator;

//구성요소 - 상수, 추상 매서드
// 필드나 생성자가 없음
// 인터페이스는 주로 매서드가 추상매서드
public interface Calculator {
	final int ERROR = -999; // 인터페이스 상수 final 생략 가능
	
	
	//추상 매서드 - 선언부만 있고, 구현은 안함
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);

}
