package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
			// String 자료형으로 데이터 관리(CRUD)
			List<String> vegeList = new ArrayList<>();
			
			//자료 생성(추가Create: add())
			vegeList.add("양파");
			vegeList.add("마늘");
			vegeList.add("감자");
			vegeList.add("고추");
			
			//특정 자료 조회(Read: get())
			System.out.println(vegeList.get(1));
			
			//리스트 객체의 계수
			System.out.println("총 객체수: "+ vegeList.size());
			
			//객체 수정(Update: set())
			vegeList.set(1, "고구마");
			
			//객체 삭제(Delete: remove())
			if(vegeList.contains("감자"))
				vegeList.remove("감자");
			
			//전체 자료 조회(Read: get())
			for(int i = 0 ; i<vegeList.size(); i++) {
				String vege = vegeList.get(i);
				System.out.println(vege);
			}
	}

}
