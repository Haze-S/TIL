package ch06;

public class Student { // ��������� �����̵Ǹ� �ڵ����� �ʱ�ȭ�� �ȴ�.
	public int studentNumber;
	public String studentName; // null
	public int grade; // 0
	
	public Student() {} 
	// constructor �����ε�, �⺻ �������� �������� ���� ������ ���� �Ʒ��� �����ڸ� ���� ���� ���� �����ڸ� �����.
	// Ŭ������ �Ӽ��� ������ ���ԵǾ�� �Ѵٸ� ����Ʈ �����ڴ� �����ϸ� �ȵȴ�.
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber; // ���� ����� ������ ������ ã�� ������ this�� ����ؾ� ��� �������� ������ �� �ִ�.
		this.studentName = studentName;
		this.grade = grade;
		
	}
	public String showStudentInfo() { // ���������� �ڵ����� �ʱ�ȭ�� ���� �ʴ´�.
		return studentName + "�л��� �й���" + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
	}
}
