package constant;

public class ConstantTest1 {

	public static void main(String[] args) {
		// 상수 선언 및 사용
		//final int maxNum=100; // 상수는 변경될 수 없음.
		int radius = 5;
		final double PI = 3.14;
		double circleArea;
		
		circleArea = radius*radius*PI;
		System.out.println("넓이= "+ circleArea);
		
		

	}

}
