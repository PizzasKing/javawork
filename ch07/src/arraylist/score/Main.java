package arraylist.score;

public class Main {

	public static void main(String[] args) {
		Student std1= new Student(101, "우영우");
		Student std2= new Student(102, "박민수");
		
		std1.addSubject("국어", 90);
		std1.addSubject("수학", 80);
		
		std2.addSubject("국어", 80);
		std2.addSubject("수학", 70);
		
		std1.showStudentInfo();
		std2.showStudentInfo();

	}

}
