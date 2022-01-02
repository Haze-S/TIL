package ch09;

public class Student {

	int sudentId;
	String studentName;
	
	Subject korea;  // ������� �����ڷ���
	Subject math;
	
	Student(int studentId, String StudentName){
		this.sudentId = studentId;
		this.studentName = StudentName;
		
		korea = new Subject();  // �� ��ü�� ���Ұ� ����� �и��� �ϱ� ���� �����ڷ����� �����ؼ� ����ϴ� ���� ����.
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;	
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	public void showScoreInfo() {
		int total = korea.score + math.score;
		System.out.println( studentName + "�л��� ������" + total+ "�� �Դϴ�.");
	}
}
