package methods;

public class MathTest {

	public static void main(String[] args) {
		// 내장 함수 - Math
		int v1 =Math.abs(-10); // 절대값
		System.out.println(v1);
		
		long v2 = Math.round(5.5); // 반올림
		System.out.println(v2);
		
		double v3 = Math.floor(3.3); // 버림 해서 3.0
		System.out.println(v3);
		
		// random() - 무작위  0.0 <= rand < 1.0
		double rand = Math.random();
		System.out.println(rand);
		int dice = (int)(Math.random()*6)+1;
		System.out.println(dice);
		
		int number =(int)(Math.random()*10)+1;
		System.out.println(number);

	}

}