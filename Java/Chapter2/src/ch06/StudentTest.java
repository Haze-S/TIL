package ch06;

// 클라이언트 모듈 (서비스를 사용하는 모듈)
public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.grade = 1;
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(123456, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}
}
