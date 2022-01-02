package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); // 积己磊
		// Student = 按眉 单捞磐鸥涝
		
		studentLee.studentId = 12345;
		studentLee.studentName = "Lee";
		studentLee.address = "何魂 楷力备";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentId = 54321;
		studentKim.setStudentName("Kim");
		studentKim.address = "何魂 柳备";
		
		studentKim.showStudentInfo();
	}

}
