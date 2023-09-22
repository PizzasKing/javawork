package collection.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MemberHashMap {
	//HashMap 자료구조 객체 생성
	private Map<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}

	//회원 추가
	public void addMember(Member member) {
		// key - memberId, value - member객체
		hashMap.put(member.getMemberId(), member);
	}
	
	public void showAllMember() {
		//인덱싱이 안됨(순서가 없음) - 반복자(Iterator) 사용, keySet() -키 모음
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}		
	}
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	//회원의 전체 수
	public int getSize() {
		return hashMap.size();
	}
}












