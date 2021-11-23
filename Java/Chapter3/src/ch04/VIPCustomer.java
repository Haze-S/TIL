package ch04;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agentID;
	
//	public VIPCustomer() {
//		// Ŭ���� �����ڰ� ����� ���� ��� �����Ϸ��� super();�� �־ ���� Ŭ������ ȣ�����ش�.
//		// superŰ����� ���� Ŭ������ ���� Ŭ���� �ν��Ͻ��� �������� ���� �ȴ�.
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
