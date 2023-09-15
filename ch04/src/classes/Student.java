package classes;

//참조(reference) 자료형
public class Student {
	//클래스 내부에서 변수=(field)
	String name;  // 학생 이름
	int studentId;  // 학번
	int grade;
	
	// 함수가 아니므로 반환형(ex. void)이 없음
	// 클래스 이름과 같음. 기본 생성자(매개변수 없는 생성자)는 생략
	// 컴파일러가 자동 생성
	public Student() {} // 기본 생성자
	
	//학생의 정보를 출력하는 매써드(함수)
	public void showStudentInfo() {
		System.out.println("이름: "+name + "\n학번: "+studentId+ "\n학년: "+ grade);
	}

}
