package whileexample;

public class WhileIfBreak {

	public static void main(String[] args) {
		// 반복 조건문
		// 1부터 10까지 출력
		
		int i=0;
		while(true) {
			i++;
			System.out.println(i+" ");
			if(i == 10) {
				break;
			}
		}
	}

}
