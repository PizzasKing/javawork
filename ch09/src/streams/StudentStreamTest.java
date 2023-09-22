package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStreamTest {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("콩쥐", 80), new Student("팥쥐", 90), new Student("심청", 60));

		Stream<Student> stdStream = list.stream();
		System.out.println("===========전체 출력===========");
		stdStream.forEach(std -> {
			System.out.println(std.getName()+": "+ std.getScore()+"점");
		});
		System.out.println("===========객체 이름만 출력===========");
		stdStream = list.stream();
		stdStream.forEach(std -> System.out.println(std.getName()));
		
		System.out.println("===========학생 점수만 출력===========");
		
		//학생 점수에 해당되는 내용만 출력
		//정수인 경우 - mapToInt() 사용
		stdStream = list.stream();
		stdStream.mapToInt(std -> std.getScore()).forEach(n -> System.out.println(n));
		
		//점수가 90점 이상인 학생의 이름 출력
		//filter() 함수 - 조건에 일치되는 내용을 걸러낼때
		System.out.println("===========90점 넘는 학생 이름만 출력===========");
		list.stream().filter(std -> std.getScore() >= 90).map(std -> std.getName()).forEach(s -> System.out.println(s));
	}

}
