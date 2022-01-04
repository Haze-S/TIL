package ch24;

import java.util.ArrayList;

public class Student {

	int sudentId;
	String studentName;
	
	ArrayList<Subject> subjectList;

	Student(int studentId, String StudentName){
		this.sudentId = studentId;
		this.studentName = StudentName;
		
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	public void showScoreInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + "학생의 " + subject.getName() + " 과목의 성적은 " + subject.getScore() + "입니다.");
		}
		
		System.out.println( studentName + "학생의 총점은" + total + "점 입니다.");
	}
}
