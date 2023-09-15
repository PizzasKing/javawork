package arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 크기가 4인 정수형 배열 선언
		int[] number = new int[4];
		double average=0;
		number[0]= 10;
		number[1]= 20;
		number[2]= 30;
		int total=0;
		for(int i=0; i<number.length; i++) {
			total += number[i];
			System.out.println(number[i]);
		}
		System.out.println(total);
		average = total /number.length;
		
		System.out.println(average);
	}

}
