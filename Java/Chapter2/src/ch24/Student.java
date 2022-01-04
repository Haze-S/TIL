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
			System.out.println(studentName + "�л��� " + subject.getName() + " ������ ������ " + subject.getScore() + "�Դϴ�.");
		}
		
		System.out.println( studentName + "�л��� ������" + total + "�� �Դϴ�.");
	}
}
