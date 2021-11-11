package homework;

public class User {
	public int userHeight;
	public int userWeight;
	public String userName;
	public int userAge;
	
	public void showStudentInfo() {
		System.out.println("키가 " + userHeight + "이고 몸무게가 " + userWeight + "킬로 인 남성이 있습니다. 이름은 " + userName + "이고 나이는 " + userAge + "세입니다.");
	}
}
