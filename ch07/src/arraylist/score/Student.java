package arraylist.score;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList; // ArrayList - Subject객체를 저장할 배열

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}

	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score);
		subjectList.add(subject);
	}

	public void showStudentInfo() {
		int total = 0;
		double avg;
		for (int i = 0; i < subjectList.size(); i++) {
			Subject s = subjectList.get(i);
			total += s.getScorePoint();
			System.out.printf("학생 %s의 %s 과목의 점수는 %d점입니다.\n",studentName,s.getSubjectName(),s.getScorePoint());
		}
		avg = (double)total/subjectList.size();
		System.out.printf("학생 %s의 총점은 %d점, 평균은 %.1f점 입니다.\n", studentName, total, avg);
		System.out.println("================================================");
	}
}
