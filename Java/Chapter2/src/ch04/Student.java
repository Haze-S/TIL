package ch04;

public class Student {
	
	public int studentId;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentId + "�й��� ���� �л��� �̸��� " + studentName + "�̰�, �ּҴ� " + address + "�Դϴ�.");
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public String getStudentName() {
		return studentName;
	}
}
