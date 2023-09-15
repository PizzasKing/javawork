package operator;

public class OperatorEx1 {
	
	public static void main(String[] args) {
		// 산술 연산자(상수)
		// 계산의 결과는 기본이 정수형(int)
		/*
		System.out.println(4+8);
		System.out.println(4-8);
		System.out.println(4*8);
		System.out.println(4/(float)8);
		*/
		// 나눗셈은 실수로 값이 나오기때문에 'float' 'double'형으로 변환
		// 산술 연산자(변수 사용)
		int a=4;
		int b=8;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((double)a/b);		
	}

}
