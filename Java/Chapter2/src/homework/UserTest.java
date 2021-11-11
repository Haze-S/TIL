package homework;

public class UserTest {
	public static void main(String[] args) {
		User userTom = new User();
		
		userTom.userHeight = 180;
		userTom.userWeight = 78;
		userTom.userName = "Tomas";
		userTom.userAge = 37;
		
		userTom.showStudentInfo();
	}
}
