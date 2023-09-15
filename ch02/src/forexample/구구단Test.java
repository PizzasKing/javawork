package forexample;

public class 구구단Test {

	public static void main(String[] args) {
		// 구구단
		/*for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("[%d단] %d x %d = %d\n",i, i, j, i*j);
			}
			System.out.println();
		}*/
		// 단보다 곱하는 수가 작거나 같은 경우까지만 출력
		for(int i=2; i<10;i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("[%d단] %d x %d = %d\n",i, i, j, i*j);
			}
			System.out.println();
		}

	}

}
