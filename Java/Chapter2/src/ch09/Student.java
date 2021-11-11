package ch09;

public class Student {

	int sudentId;
	String studentName;
	
	Subject korea;  //  멤버변수 참조자료형
	Subject math;
	
	Student(int studentId, String StudentName){
		this.sudentId = studentId;
		this.studentName = StudentName;
		
		korea = new Subject();  //  생성자
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
		System.out.println( studentName + "학생의 총점은" + total+ "점 입니다.");
	}
}
