package objectequals.member;

public class Member {
	private String memberId;
	private String name;
	
	public Member(String memberId, String name) {
		this.memberId = memberId;
		this.name=name;
		
		
	}

	@Override
	public int hashCode() {
		return memberId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member =(Member)obj;
			if(this.memberId.equals(member.memberId)) {
				return true;
			}
		}
		return false;
	}
	
	

}
