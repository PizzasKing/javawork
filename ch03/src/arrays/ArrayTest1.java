package arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 배열 직접저장-중괄호{} 사용
		String[] cars= {"Sonata", "Morning", "K7"};
		
		System.out.println(cars[2]);
		System.out.println("배열 크기: "+cars.length);
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
