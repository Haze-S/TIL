package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); // ������
		// Student = ��ü ������Ÿ��
		
		studentLee.studentId = 12345;
		studentLee.studentName = "Lee";
		studentLee.address = "�λ� ������";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentId = 54321;
		studentKim.setStudentName("Kim");
		studentKim.address = "�λ� ����";
		
		studentKim.showStudentInfo();
	}

}
