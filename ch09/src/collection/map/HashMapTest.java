package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// 학생의 이름과 점수를 저장할 HashMap 객체 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("이순신", 95);  //key, value
		map.put("박명수", 87);
		map.put("홍길동", 70);

		//특정 객체 조회(키->점수)
		System.out.println(map.get("박명수"));
		
		//총 객체 수
		System.out.println("총 객체수: "+ map.size());
		
		//전체 조회
		Set<String> keySet = map.keySet();  // key값 객체를 생성
		Iterator<String> ir = keySet.iterator();  // 키값으로 반복할 반복자 객체 생성
		while(ir.hasNext()) {
			String key = ir.next();
			Integer value = map.get(key);
			System.out.println(key+": "+ value);
		}
		System.out.println("===========");
		//조회2
		for(String key : keySet) {
			System.out.println(key + ": "+ map.get(key));
		}
		//객체 자체를 출력 - {key = value}
		System.out.println(map);
	}
}









