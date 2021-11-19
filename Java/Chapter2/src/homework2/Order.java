package homework2;

public class Order {
	public String orderNumber;
	public String orderPhone;
	public String orderAddress;
	public int orderDate;
	public int orderTime;
	public int orderPrice;
	public int menuNumber;
	
	public Order() {}
	public Order(String orderNumber, String orderPhone, String orderAddress, int orderDate, int orderTime, int orderPrice, int menuNumber) {
		this.orderNumber = orderNumber;
		this.orderPhone = orderPhone;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNumber = menuNumber;
	}
	public String showOrderInfo() {
		return "�ֹ� ���� ��ȣ : " + orderNumber + System.lineSeparator() +
			"�ֹ� �ڵ��� ��ȣ : " + orderPhone + System.lineSeparator() +
			"�ֹ� �� �ּ� : " + orderAddress + System.lineSeparator() +
			"�ֹ� ��¥ : " + orderDate + System.lineSeparator() +
			"�ֹ� �ð� : " + orderTime + System.lineSeparator() +
			"�ֹ� ���� : " + orderPrice + System.lineSeparator() +
			"�޴� ��ȣ : " + menuNumber;
	}
}
