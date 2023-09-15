package operator;

public class Exchange {

	public static void main(String[] args) {
		// 변수 값 교환
		// 변수 선언 - 입력
		
		int x= 0;
		int y= 1;
		
		
		System.out.println("x="+x+" y="+y);
		System.out.println("**********교환후**********");
		int temp;
		temp = x;
		x=y;
		y=temp;
		System.out.println("x="+x+" y="+y);
	}

}
