package switchexample;

public class SwitchCaseTest3 {
	public static void main(String[] args) {
		// 사칙연산 - 산술 기호
		
		int num1= 10;
		int num2= 2;
		char operator ='+';
		double result= 0;
		
		switch(operator) {
		case '+':
			result= num1+num2;
			break;
		case '-':
			result= num1-num2;
			break;
		case '*':
			result= num1*num2;
			break;
		case '/':
			result= (double)num1/num2;
		default:
			System.out.println("지원되지 않습니다.");
			return;
		}
		System.out.println("결과값: "+result);
	}

}
