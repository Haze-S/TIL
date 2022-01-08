package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest11 {

	public static void main(String[] args) {

		System.out.println("알파벳을 쓰고 [Enter]를 누르세요.");
		
		int i;
		
		try {
			InputStreamReader irs = new InputStreamReader(System.in); 
			// System.in은 바이트 단위로 처리하기 때문에 한글을 쓰면 깨지게 되는 걸 방지하기 위해 InputStreamReader를 씀. 
			// InputStreamReader는 바이트 단위로 처리하는 스트림을 모두 감쌀 수 있다.
			while((i = irs.read()) != '\n') {
				//System.out.println(i);
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
