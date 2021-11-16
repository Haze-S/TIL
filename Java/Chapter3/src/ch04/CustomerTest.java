package ch04;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "Lee");
//		customerLee.setCustomerName("Lee");
//		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer(10020, "Kim");
//		customerKim.setCustomerName("Kim");
//		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
		
//		Customer() call
//		VIPCustomer() call
//		Kim님의 등급은VIP이며, 보너스 포인트는10000입니다.
	}
}
