package collection.member;

import java.util.ArrayList;

public class MemberArrayList {
	// 필드 -자료구조 명시
	private ArrayList<Member> arrayList;
	
	//생성자
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//회원추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원 목록 조회
	public void showAllMember() {
		for(int i = 0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	public int getSize() {
		return arrayList.size();
	}
	//회원삭제, 이미 등록된 회원번호를 가져와서 매개로 전달된 회원아이디와 비교해서 있으면 삭제
	public boolean removeMember(int memberId) {
		for(int i = 0; i<arrayList.size(); i++) {
			int dbId = arrayList.get(i).getMemberId();
			if(dbId == memberId) {  // 외부 아이디와 비교해서 일치하면 삭제
				arrayList.remove(i);
				return true;
			}
		}return false;
	}
}
