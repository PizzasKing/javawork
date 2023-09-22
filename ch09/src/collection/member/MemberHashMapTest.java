package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberMap = new MemberHashMap();
		
		//회원 추가
		memberMap.addMember(new Member(1001, "홍길동"));
		memberMap.addMember(new Member(1003, "박명수"));
		memberMap.addMember(new Member(1002, "이순신"));
		//키는 중복불가. 값은 바뀜
		memberMap.addMember(new Member(1003, "유재석"));
		
		//회원 삭제
		memberMap.removeMember(1003);
		
		System.out.println("총 객체 수: "+ memberMap.getSize());
		
		//회원 목록
		memberMap.showAllMember();

	}

}
