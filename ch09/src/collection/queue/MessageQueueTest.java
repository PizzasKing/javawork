package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueueTest {

	public static void main(String[] args) {
		Queue<Message> msgQueue = new LinkedList<>();
		
		//Message 객체 생성
		Message email = new Message("email", "이순신");
		Message sms = new Message("sms", "양만춘");
		Message katalk = new Message("kakaotalk", "홍길동");
		
		//객체 저장 - offer()
		msgQueue.offer(email);
		msgQueue.offer(sms);
		msgQueue.offer(katalk);
		
		//객체 꺼내기 - 삭제
		//반복 - 확인(isEmpty())
		while(!msgQueue.isEmpty()) {
			Message message = msgQueue.poll();   //1개 꺼냄
			switch(message.command) {
			case "email":
				System.out.println(message.to+"님에게 이메일을 보냅니다.");
				break;
			case "sms":
				System.out.println(message.to+"님에게 문자를 보냅니다.");
				break;
			case "kakaotalk":
				System.out.println(message.to+"님에게 카톡을 보냅니다.");
				break;
			}
		}
		
	}

}
