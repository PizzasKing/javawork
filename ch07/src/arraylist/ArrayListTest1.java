package arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		//String [] carts = new String[4];
		//carts[0] = "사과"
		//String[] carts = {"사과", "콩나물", "커피", "우유"};

		//리스트 공간이 기본 10개 생성
		ArrayList<String> carts = new ArrayList<String>();
		
		//자료 추가 - add()
		carts.add("사과");
		carts.add("콩나물");
		carts.add("사과");
		carts.add("커피");
		carts.add("커피");
		
		//자료 수정 - set()
		//carts.set(2, "바나나");
		
		//자료 삭제 - remove()
		carts.remove("사과");
		
		//자료 출력 - get()
		System.out.println(carts.get(0));
		System.out.println(carts.get(1));
		System.out.println(carts.get(2));
	
		System.out.println("리스트 크기: "+ carts.size());
		
		//전체 조회
		for(int i=0; i<carts.size(); i++) { // 리스트를 처음부터 반복하면서 저장된 자료를 가져와서 cart에 저장
			String cart = carts.get(i);
			System.out.print(cart+ " ");
		}
		System.out.println();
		
		for(String cart: carts)
			System.out.print(cart + " ");
	}

}
