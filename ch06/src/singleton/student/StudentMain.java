package singleton.student;

public class StudentMain {

	public static void main(String[] args) {
		School school = School.getInstance();
		
		Student newStudent1 = school.createNum();
		Student newStudent2 = school.createNum();
		Student newStudent3 = school.createNum();
		
		
		System.out.println(newStudent1.getStudentNum());
		System.out.println(newStudent2.getStudentNum());
		System.out.println(newStudent3.getStudentNum());

	}

}
