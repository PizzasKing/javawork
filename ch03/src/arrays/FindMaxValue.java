package arrays;

public class FindMaxValue {

	public static void main(String[] args) {
		// 배열에서 최대값 찾기
		int[] arr = new int[] { 1, 5, 8, 3, 2 };
		int maxVal = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		System.out.println(maxVal);

	}

}
