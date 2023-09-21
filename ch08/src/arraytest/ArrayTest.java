package arraytest;

public class ArrayTest {
	public static int add(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		
		int result = add(numbers);
		
		System.out.println(result);
		//for(int i=0; i<numbers.length; i++) {
			//sum = sum+numbers[i];
			//System.out.println(numbers[i]);
		}
		
	}


