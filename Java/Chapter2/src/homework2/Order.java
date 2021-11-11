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
		return "주문 접수 번호 : " + orderNumber + System.lineSeparator() +
			"주문 핸드폰 번호 : " + orderPhone + System.lineSeparator() +
			"주문 집 주소 : " + orderAddress + System.lineSeparator() +
			"주문 날짜 : " + orderDate + System.lineSeparator() +
			"주문 시간 : " + orderTime + System.lineSeparator() +
			"주문 가격 : " + orderPrice + System.lineSeparator() +
			"메뉴 번호 : " + menuNumber;
	}
}
