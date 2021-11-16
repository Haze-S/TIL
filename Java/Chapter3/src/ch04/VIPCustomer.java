package ch04;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agentID;
	
//	public VIPCustomer() {
//		// 클래스 생성자가 상속을 받은 경우 컴파일러가 super();를 넣어서 상위 클래스를 호출해준다.
//		// super키워드는 하위 클래스가 상위 클래스 인스턴스의 참조값을 갖게 된다.
//		
//		super(0, "no-name");
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() call");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
	
	public String getAgentID() {
		return agentID;
	}
	
}
