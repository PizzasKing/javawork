package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest2 {

	public static void main(String[] args) {
		User[] users=new User[3];
		
		User user1 = new User("sky789", "abc123", "홍길동");
		User user2 = new User("sky234", "ddsc122", "이나영");
		User user3 = new User("sky345", "adfe23", "김철수");
		
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;

	}

}
