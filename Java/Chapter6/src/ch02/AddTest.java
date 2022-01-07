package ch02;

public class AddTest {

	public static void main(String[] args) {

		Add addL1 = (x, y) -> {return x + y;};
		Add addL2 = (x, y) -> x + y;
		
		System.out.println(addL1.add(2, 3));
	}

}
