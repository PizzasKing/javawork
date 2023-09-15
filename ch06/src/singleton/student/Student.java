package singleton.student;

public class Student {
	private static int serialNum=20230000;
	private int studentNum;
	
	public Student() {
		serialNum++;
		studentNum = serialNum;
	}
	
	public int getStudentNum() {
		return studentNum;
	}

}
