package ch16;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("Lee");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("Kim");
		
		System.out.println(employeeLee.getEmployeeName()+"님의 사번은"+employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName()+"님의 사번은"+employeeKim.getEmployeeId());
	}
}
