package ch19;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee etiopiaCoffee = new EtiopiaAmericano();
		etiopiaCoffee.brewing();
		
		System.out.println();
		Coffee etiopiaLatte = new Latte(etiopiaCoffee);
		etiopiaLatte.brewing();

		System.out.println();
		Coffee mochaEtiopia = new Mocha(new Latte(new EtiopiaAmericano()));
		mochaEtiopia.brewing();
		
		System.out.println();
		Coffee keyaCoffee = new WhippingCream(new Mocha(new Latte(new KeyaAmericano())));
		keyaCoffee.brewing();
	}

}
