package ch06;

public class Student { 
	
	// 지역변수와 달리 멤버변수는 생성이되면 자동으로 초기화가 된다.
	// String = null, int = 0
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {} 
	// constructor 오버로딩, 기본 생성자의 생성으로 인해 에러가 생겨 아래의 생성자를 쓰기 위해 직접 생성자를 만든다.
	// 클래스의 속성이 무조건 기입되어야 한다면 디폴트 생성자는 생성하면 안된다.
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber; // 가장 가까운 곳에서 변수를 찾기 때문에 this를 사용해야 멤버 변수에게 전달할 수 있다.
		this.studentName = studentName;
		this.grade = grade;
		
	}
	public String showStudentInfo() { // 지역변수는 자동으로 초기화가 되지 않는다.
		return studentName + "학생의 학번은" + studentNumber + "이고, " + grade + "학년 입니다.";
	}
}
