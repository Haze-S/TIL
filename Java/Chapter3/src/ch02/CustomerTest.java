package ch02;

public class CustomerTest {
	public static void main(String[] args) {
		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("Lee");
//		customerLee.setCustomerID(10010);
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("Kim");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo()); //Kim님의 등급은VIP이며, 보너스 포인트는10000입니다.
	}
}
