package nestedclass.student;

class Student{
	String name;
	
	public Student(String name) {
		this.name = name;		
	}
	//내부 클래스(중첩 클래스)
	class Score{
		int eng;
		int math;
		
		void showInfo() {
			System.out.println("이름:"+ name );
			System.out.println("영어점수:"+ eng );
			System.out.println("수학점수:"+ math );
		}
	}
	
}
public class StudentTest {

	public static void main(String[] args) {
		// 외부 클래스의 객체 생성
		Student jang = new Student("장");

		// 내부 클래스의 인스턴스 생성
		// 외부클래스.내부클래스 인스턴스 = 내부 인스턴스.new 내부클래스()
		Student.Score score = jang.new Score();
		
		score.eng = 99;
		score.math = 50;
		score.showInfo();
	}

}
