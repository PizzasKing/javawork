package arrays;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 실수형 배열의 연산
		// 크기가 5인 실수형 배열 data
		double[] data = new double[5];
		double total = 0;
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		System.out.println(total);
		System.out.println(total / data.length);

	}

}
