package funcinterface.calculator;

public class CaculatorTest {

	public static void main(String[] args) {
		//Calculator 변수 선언 -add
		Calculator add, sub, mul, div;
		int num1 = 10, num2 = 5;
		
		
		
		//calculate()를 구현 - 람다식
		// 덧셈, 뺄셈, 곱셈, 나눗셈
		add = (x, y) -> x+y;
		System.out.println("덧셈: "+add.calculate(num1, num2));
		sub = (x, y) -> x-y;
		System.out.println("뺄셈: "+sub.calculate(num1, num2));
		mul = (x, y) -> x*y;
		System.out.println("곱셈: "+mul.calculate(num1, num2));
		div = (x, y) -> x/y;
		System.out.println("나눗셈: "+div.calculate(num1, num2));
		//calculate() 호출

	}

}
