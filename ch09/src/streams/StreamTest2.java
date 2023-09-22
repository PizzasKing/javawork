package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		// 문자열 배열
		String[] 과일 = {"사과", "배", "수박", "참외"};
		
		//for문 사용하지 않고 forEach() 사용
		Stream<String> strStream = Arrays.stream(과일);
		strStream.forEach(str -> System.out.println(str));
		
		int[] number = {1, 2, 3, 4};
//		Stream<Integer> numStream = Arrays.stream(number);
//		numStream.forEach(n -> System.out.println(n));
		Arrays.stream(number).forEach(n -> System.out.println(n));

		//합계
		int sumVal = Arrays.stream(number).sum();
		System.out.println("합계: " + sumVal);
		
		int count = (int)Arrays.stream(number).count();
		double avg = (double)sumVal / count;
		
		System.out.println("합계: " + sumVal);
		System.out.println("개수: " + count);
		System.out.println("평균: " + avg);
	}

}
