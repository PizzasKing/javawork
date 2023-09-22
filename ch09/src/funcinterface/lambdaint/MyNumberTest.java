package funcinterface.lambdaint;

public class MyNumberTest {

	public static void main(String[] args) {
		//인터페이스형 변수 선언
		MyNumber1 number;
		
		//변수에 람다식을 저장
		//calculate 구현
//		number = (x) ->{  // 더하기 연산
//			x+=10;
//			System.out.println(x);
//		};

		number = x -> System.out.println(x+10);
		number.calculate(1);
		
		number = n -> System.out.println(n *n);
		number.calculate(2);
	}

}
