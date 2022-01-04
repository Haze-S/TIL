package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<>();
		// 원래는 <> 안에 생성자를 넣어야 했으나 안 써도 생성할 수 있다.
		
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
		 
		for(int i = 0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
