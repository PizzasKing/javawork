package free;

public class Constant {

	public static void main(String[] args) {
		// 선언
		final int Max=100;
		final int Min=0;
		
		/*
		int Min=0; 오류: final은 값 변경x
		*/
		
		System.out.println(Max+" "+Min);

	}

}
