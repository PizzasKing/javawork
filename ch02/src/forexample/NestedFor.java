package forexample;

public class NestedFor {

	public static void main(String[] args) {
		// 숫자 증가
		/*
		 * 1 2 3 4 5 
		 * 6 7 8 9 10 
		 * 11 12 13 14 15 
		 * 16 17 18 19 20
		 */
		for (int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				int a=5*i+j;
				System.out.print(a+" ");
			}
			System.out.println();
		}

	}

}
