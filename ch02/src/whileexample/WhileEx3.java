package whileexample;

public class WhileEx3 {

	public static void main(String[] args) {
		// 1~10 출력
		// 반복 조건문 (while if break)
		// 변수 -i
		int i = 0;
		
		while(true) {
			i++;
			System.out.println(i);
			if(i==10) {
				break;
			}
		}
	}

}
