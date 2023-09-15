package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest {

	public static void main(String[] args) {
		
		User user1=new User();
		
		user1.setId("abc123");
		user1.setPwd("456qwe");
		user1.setName("박민수");
		
		
		System.out.println("아이디: "+user1.getId());
		System.out.println("비번: "+user1.getPwd());
		System.out.println("이름: "+user1.getName());
		
		

	}

}
