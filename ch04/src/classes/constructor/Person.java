package classes.constructor;

// 참조 자료형 - Person 클래스 정의
public class Person {
	
	String name;  // 이름
	float height;  // 키
	float weight;  // 몸무게
	
	public Person() {}
	
	public Person(String n) {  // 이름 매개변수
		name = n;
	}
	
	public Person(String n, float h, float w) {
		name =n;
		height = h;  // 외부에서 입력한 키
		weight = w;  // 외부에서 입력한 몸무게
	}
	
	//매서드
	public void showPersonInfo() {
		System.out.printf("이름: %s\n키: %.1f\n몸무게: %.1f\n", name, height, weight);
		
	}
}
