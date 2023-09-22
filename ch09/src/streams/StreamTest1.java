package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		//ArrayList에 객체 생성해서 저장함
		//List<String> list = Arrays.asList("LG", "Samsung", "현대");
		List<String> list = new ArrayList<>();
		
		list.add("LG");
		list.add("Samsung");
		list.add("현대");
		
		//comStream 생성 후 한번만 사용됨
		Stream<String> comStream = list.stream();
		comStream.forEach(com -> System.out.println(com));
		//for(), forEach() - 객체를 각각출력

	}

}
