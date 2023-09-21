package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// Set 인터페이스를 구현한 HashSet 클래스의 객체 생성
		Set<String> set = new HashSet<>();
		
		// 객체 생성
		set.add("Java");
		set.add("Jdbc");
		set.add("Jsp");
		
		//객체의 수
		System.out.println("총 객체수: "+ set.size());
		
		//전체 목록 조회
		//순서가 없어서 인덱싱을 할 수 없음
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next(); //다음 객체가 있으면 가져옴
			System.out.println(element);
		}
		System.out.println("================");
		
		for(String element: set) {
			System.out.println(element);
		}
		System.out.println(set);
		

	}

}
