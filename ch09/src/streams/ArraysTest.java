package streams;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		int[] num1 = {3, 1, 2, 4, 5};
		
		
		//Arrays.toString() - 객체 그대로(리스트형) 출력
		System.out.println(Arrays.toString(num1));
		
		//num1의 요소 중 3개 복사
		int[] num2 = Arrays.copyOf(num1, 3);
		System.out.println(Arrays.toString(num2));
		
		//오름차순 정렬 - Arrays.sort()
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
		
		Collections.reverse(Arrays.asList(num1));
		System.out.println(Arrays.toString(num1));
		
		//Integer[] num2 = Arrays.copyOf(num1, 3);
		System.out.println(Arrays.toString(num2));
		

	}

}
